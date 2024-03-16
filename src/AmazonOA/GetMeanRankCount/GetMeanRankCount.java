package AmazonOA.GetMeanRankCount;

public class GetMeanRankCount {

    public int[] getMeanRankCount(int[] rank) {
        // write your code here
        //given an array
        //find number of subarrays meets condition
        //avg of subarray == x [1, n]


        int n = rank.length;
        int[] ans = new int[n];

        //dp????????
        int[][] dp = new int[n][n];
        //denotes sum of subarary[i, j] mean dp[i][j]

        for(int i = 0; i < n; i++) {
            dp[i][i] = rank[i];
        }

        for(int i = 1; i < n; i++) {
            dp[i - 1][i] = rank[i - 1] + rank[i];
        }

        for(int len = 3; len <= n; len++) {
            for(int i = 0; i < n; i++) {
                //end - i + 1 = len
                int end = len + i - 1;
                if(end < n) {
                    dp[i][end] = rank[i] + rank[end] + dp[i + 1][end - 1];
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                double mean = (double)dp[i][j] / (double)(j - i + 1);
                //how to check if a double value has no floating numbers
                if(mean % 1 == 0 && mean >= 1 && mean <= n) {
                    ans[(int)(mean - 1)]++;
                }
            }
        }

        return ans;

    }

}
