package ServiceNowOA.MaxSumOfBalancedSeq;

public class MaxSumOfBalancedSequence {

    public int maxSumOfBalancedSubsequence(int[] nums) {
        int n = nums.length;
        //WRONG SOLUTION
        //[0, n - 1]
        //diff = [0, n - 1]
        int ans = 0;
        int[] diff = new int[n];

        for(int i = 0; i < n; i++) {
            diff[0] += nums[i];
            for(int j = i + 1; j < n; j++) {
                int valDiff = nums[j] - nums[i];
                int indexDiff = j - i;

                if(valDiff == indexDiff) {
                    diff[valDiff] += nums[i] + nums[j];
                    ans = Math.max(ans, diff[valDiff]);
                }
            }
        }

        return ans;
    }


//1,3,4,6
}
