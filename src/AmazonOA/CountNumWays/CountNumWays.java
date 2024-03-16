package AmazonOA.CountNumWays;

public class CountNumWays {

    public int countNumWays(String s, int k) {
        // write your code here

        //do not pick subtrings that are palindrom
        //or a substring that is NOT PALINDROM AND start char == end char

        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        int count = 0;
        for(int i = 1; i < n; i++) {
            if(s.charAt(i - 1) == s.charAt(i)) {
                dp[i - 1][i] = true;
            } else{
                if(k ==2 && s.charAt(i - 1) > s.charAt(i)) {
                    count++;
                }
            }
        }

        for(int len = 3; len <= n; len++) {
            for(int i = 0; i < n; i++) {
                //end - i + 1 = len
                int end = len + i - 1;
                if(end < n) {
                    if(s.charAt(i) == s.charAt(end) && dp[i + 1][end - 1]) {
                        dp[i][end] = true;
                    }else if(s.charAt(i) != s.charAt(end)) {
                        if(len == k && s.charAt(i) > s.charAt(end)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

}
