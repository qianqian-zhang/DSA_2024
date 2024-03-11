package CountDistinctPasswords;
//given a string
//you can reverse a substring and generate a new string
//return number of unique strings that you can generate

//1. don't reverse palindromic substrings
//2. for a non-palindromic substring [a, b], if chars at a and b are equal AND substring[a + 1, b - 1] is palindromic, dont reverse
public class CountDistinctPasswords {
    public long countDistinctPasswords(String password) {
        //check substrings of length [2, n]

        //find number of non-palindrome substrings
        //start char != end char
        //start char == end char, inner substring [start + 1, end - 1] is NOT palindromic

        int n = password.length();
        long ans = 1l; //count the original substring

        boolean[][] isPalindrome = new boolean[n][n]; //denotes if substring [i, j] is palindromic

        //substring of length 1
        for(int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        //substring of length 2
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

        return ans;
}
}
