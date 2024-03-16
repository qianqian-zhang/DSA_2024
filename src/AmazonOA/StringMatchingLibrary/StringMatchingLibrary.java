package AmazonOA.StringMatchingLibrary;

public class StringMatchingLibrary {

    public String[] matchStrings(String[] text, String[] pat) {
        // write your code here
        int n = text.length;
        String[] ans = new String[n];

        for(int i = 0; i < n; i++) {
            String t = text[i];
            String pattern = pat[i];

            //check if they match
            if(match(t, pattern)) {
                ans[i] = "YES";
            }else{
                ans[i] = "NO";
            }
        }

        return ans;
    }

    public boolean match(String text, String pattern) {
        //code   co*d
        //co sdfsdfs er  co*er
        if(text.length() < pattern.length() - 1) return false;

        //get index of wildcard
        int index = pattern.indexOf("*");
        //substring before *  [0, index]
        String firstHalf = "";
        if(index > 0) firstHalf = pattern.substring(0, index);

        String secondHalf = "";
        int n = pattern.length();
        if(index < n - 1) secondHalf = pattern.substring(index + 1);

        boolean ans = true;
        //compare with
        if(firstHalf.length() > 0) {
            int len = firstHalf.length();

            if(!text.substring(0, len).equals(firstHalf)) {
                ans = false;
            }
        }

        if(secondHalf.length() > 0) {
            int len2 = secondHalf.length();
            int m = text.length();
            //[start, m - 1]
            //m - start = len2
            //start = m - len2
            if(!text.substring(m - len2).equals(secondHalf)) {
                ans = false;
            }
        }


        return ans;
    }
}
