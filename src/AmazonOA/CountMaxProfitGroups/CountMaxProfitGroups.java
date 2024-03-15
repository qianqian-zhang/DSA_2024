package AmazonOA.CountMaxProfitGroups;

public class CountMaxProfitGroups {

    public long countMaximumProfitableGroups(int[] stockPrice) {
        // given an array
        //find number of subarrays meets condition
        //start or end element is max of subarray

        //all len <= 2
        //len >= 3

        //dp
        //palindrome problem

        int n = stockPrice.length;

        int[][] dp = new int[n][n];
        //dp[i][j] denotes largest element of subarray [i, j]
        //3,1,3,5,2
        long count = 0l;
        //subarray of len1
        for(int i = 0; i < n; i++) {
            dp[i][i] = stockPrice[i];
            count++;
        }

        //subarray of len 2
        for(int i = 1; i < n; i++) {
            dp[i - 1][i] = Math.max(stockPrice[i - 1], stockPrice[i]);
            count++;
        }

        //subarry of lenth 3

        for(int len = 3; len <= n; len++) {
            for(int i = 0; i < n; i++) {
                //[i, end]
                //end - i + 1 = len
                int end = len + i - 1;

                if(end < n) {
                    //3,1,3
                    int in_max = dp[i + 1][end - 1];
                    int out_max = Math.max(stockPrice[i], stockPrice[end]);

                    if(in_max <= out_max) count++;
                    dp[i][end] = Math.max(in_max, out_max);
                }
            }
        }

        return count;
    }

}
