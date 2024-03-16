package AmazonOA.GetSuccessValue;

import java.util.Arrays;

public class GetSuccessValue {

    public int[] getSuccessValue(int[] queries, int[] num_viewers) {
        // write your code here
        Arrays.sort(num_viewers);
        int n = num_viewers.length;
//reverse
        int left = 0;
        int right = n - 1;

        while(left < right) {
            int temp = num_viewers[left];
            num_viewers[left] = num_viewers[right];

            num_viewers[right] = temp;

            left++;
            right--;
        }

//prefix sum
        for(int i = 1; i < n; i++) {
            num_viewers[i] += num_viewers[i - 1];
        }

        int m = queries.length;
        int[] ans = new int[m];

        for(int i = 0; i < m; i++) {
            int k = queries[i];

            ans[i] = num_viewers[k - 1];
        }

        return ans;


    }

}
