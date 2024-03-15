package AmazonOA.GetLongestMatch;

public class GetLongestMatch {

    public int getLongestMatch(String text, String regex) {
        //first half + * + second half
        //find first occurrence of first half
        //find last occurrence of second half
        //get length of longest substring

        //tc: o(m * n)
        //sc: o(m + n)

        //get index of *
        int n = regex.length();
        int m = text.length();
        int pos = 0;

        for(int i = 0; i < n; i++) {
            if(regex.charAt(i) == '*') {
                pos = i;
                break;
            }
        }

        //if there is a first half
        int start_of_first_half = -1;

        if(pos > 0) {
            String first_half = regex.substring(0, pos);
            int len_first_half = first_half.length();
            for(int i = 0; i < m; i++) {
                if(text.charAt(i) == first_half.charAt(0)) {
                    if(i + len_first_half - 1 < m && text.substring(i, i + len_first_half).equals(first_half)) {
                        start_of_first_half = i;
                        break;
                    }
                }
            }
        }

        //if there is a second half
        int start_of_second_half = -1;
        int len_second_half = 0;

        if(pos < n - 1) {
            String second_half = regex.substring(pos + 1);
            len_second_half = second_half.length();

            for(int i = 0; i < m; i++) {
                if(text.charAt(i) == second_half.charAt(0)) {
                    if(i + len_second_half - 1  < m && text.substring(i, i + len_second_half).equals(second_half)) {
                        start_of_second_half = i;
                    }
                }
            }
        }

        //*abs
        if(pos == 0) {
            if(start_of_second_half == -1) return -1;
            //start + len - 1 = end
            return start_of_second_half + len_second_half;
        }

        if(pos == n - 1) {
            //abc*  zzabcd
            if(start_of_first_half == -1) return -1;

            return m - start_of_first_half;
        }

        //c * de   absdfsdde

        if(start_of_first_half == -1 || start_of_second_half == -1) return -1;
        if(start_of_first_half >= start_of_second_half) return -1;

        //second half pos + 1. n - 1
        //len = n - 1 - pos
        //end - start + 1 = n - 1 - pos
        int end = n - 2 - pos + start_of_second_half;

        return end - start_of_first_half + 1;
    }

    //**************************

    public int getLongestMatchBuiltIn(String text, String regex) {
        int n = regex.length();
        int m = text.length();
        int pos = regex.indexOf('*');

        //if there is a first half
        int start_of_first_half = -1;
        if(pos > 0) {
            String first_half = regex.substring(0, pos);
            start_of_first_half = text.indexOf(first_half);
        }

        //if there is a second half
        int start_of_second_half = -1;
        int len_second_half = 0;
        if(pos < n - 1) {
            String second_half = regex.substring(pos + 1);
            len_second_half = second_half.length();
            start_of_second_half = text.lastIndexOf(second_half);
        }


        if(pos == 0) {
            if(start_of_second_half == -1) return -1;
            return start_of_second_half + len_second_half;
        }

        if(pos == n - 1) {
            if(start_of_first_half == -1) return -1;
            return m - start_of_first_half;
        }

        if(start_of_first_half == -1 || start_of_second_half == -1) return -1;
        if(start_of_first_half >= start_of_second_half) return -1;

        int end = n - 2 - pos + start_of_second_half;

        return end - start_of_first_half + 1;
    }
}
