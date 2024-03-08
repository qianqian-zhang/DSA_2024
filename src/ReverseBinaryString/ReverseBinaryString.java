package ReverseBinaryString;

public class ReverseBinaryString {


    public int reverseBinaryString(String s) {
        int count = 0;
        int prev = -1;

        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            int index = s.indexOf(c, prev + 1);

            if(index == -1) break;

            count++;
            prev = index;
        }

        return s.length() - count ;

    }


    public int reverseBinaryString2(String s) {

        //finding the length of longest prefix sequence
        //n - len is the number of operations

        //reverse the string
        String reverse = reverse(s);

        //find the longest sequence
        int count = 0;

        int j = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == reverse.charAt(j)) {
                j++;
                count++;
            }
        }

        return s.length() - count;

    }

    public String reverse(String str) {
        char[] arr = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            char temp = arr[left];

            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(arr);

    }





}
