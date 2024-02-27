package StringMatchingLibrary;

public class StringMatchingLib {
    //given two arrays text and pat
    //each regex contains one *
    //* matches zero or more lowercase letters
    //return an array of matching results

    //time complexity: o(n * m)
    //space complexity: o(n)
    //n is the length of text array
    //m is the maximum length of a string in text array
    public String[] stringMatching(String[] text, String[] pat) {
        int n = text.length;
        String[] ans = new String[n];

        for(int i = 0; i < n; i++) { //o(n)
            String text_ = text[i];
            String pattern = pat[i];

            String res = checkMatch(text_, pattern);

            ans[i] = res;
        }

        return ans;

    }

    public String checkMatch(String text, String pat) { //o(m)
        //get the index pos of *
        int n = text.length();
        int m = pat.length();

        //base case
        //text is shorter than pat
        if(n < m - 1) return "N0";

        int pos = 0;
        for(int i = 0; i < m; i++) { //o(m)
            if(pat.charAt(i) == '*') {
                pos = i;
                break;
            }
        }

        //* can be at the start, end and middle of pat   *abc  abc*  a*bc
        //given pattern [first half p chars, *, second half q chars]
        //compare first p chars of text and pat
        //compare last q chars of text and pat

        //check first half
        if(pos > 0 && !text.substring(0, pos).equals(pat.substring(0, pos))) {
            return "NO";
        }

        //check second half
        if(pos < m - 1 && !text.substring(n - m + pos + 1).equals(pat.substring(pos + 1))) {
            return "NO";
        }

        return "YES";

    }
}


//abcd *cd