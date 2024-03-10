package CountDistinctPasswords;

public class CountDistinctPasswords {
    public long countDistinctPasswords(String password) {
        // write your code here

        int n = password.length();
        long ans = 1l;

        //check substring of length [2, n - 1]

        //bruteforce

        //find number of palindrome substrings of a string
        //dp???

        //abaa
        boolean[][] isPalindrome = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        for(int i = 1; i < n; i++) {
            if(password.charAt(i) == password.charAt(i - 1)) {
                isPalindrome[i - 1][i] = true;
            }else{
                ans++;
            }
        }

        for(int len = 3; len <= n; len++) {
            for(int i = 0; i < n; i++) {
                //end - i + 1 = len
                int end = len + i - 1;

                if(end < n) {
                    if(password.charAt(i) == password.charAt(end) && isPalindrome[i + 1][end - 1]) {
                        isPalindrome[i][end] = true;
                    }else{
                        if(password.charAt(i) != password.charAt(end)) ans++;
                    }
                }
            }



        }

        //"abaa"
        return ans;

        //len = 2: baaa aaba
        //len = 3: aaab
        //len = 4: aaba
}
}
