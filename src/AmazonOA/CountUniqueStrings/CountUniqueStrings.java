package AmazonOA.CountUniqueStrings;

public class CountUniqueStrings {

    public int findNumberOfPossibleUniqueStrings(String s) {
        //given a string
        //reverse a substring and form a new string
        //find number of unique strings

        int count = 1;
        //make sure substring is not palindrome
        //len >= 3  start char != end char
        int n = s.length();

        boolean[][] isPalindrome = new boolean[n][n];
        //isPalindrome[i][j] substring[i, j] is a palindrome
        //len == 1
        for(int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        //for len == 2
        for(int i = 1; i < n; i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                isPalindrome[i - 1][i] = true;
            }else{
                count++;
            }
        }

        //len >= 3
        for(int len = 3; len <= n; len++) {
            for(int i = 0; i < n; i++) {
                //end - i + 1 = len
                int end = len + i - 1;

                if(end < n) {
                    //subtring [i, end]
                    if(s.charAt(i) == s.charAt(end) && isPalindrome[i + 1][end - 1]) {
                        isPalindrome[i][end] = true;
                    }else{
                        //start char != end char
                        if(s.charAt(i) != s.charAt(end)) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;

    }

    public int countUnique(String s) {
        int counter = 0;
        int i = 0;
        int j = s.length() - 1;
        //abbc
        //6
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                counter++;
            }
            i++;
            j--;
        }

        return counter;
    }

}
