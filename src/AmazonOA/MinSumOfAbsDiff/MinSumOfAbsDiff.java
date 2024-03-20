package AmazonOA.MinSumOfAbsDiff;

import java.util.Arrays;

public class MinSumOfAbsDiff {

    public int minimizeSumOfAbsoluteDifferences(int[] a, int[] b) {
        //given two arrays
        //pair each element from a to an element from b
        //such that sum of absolute diff is minimum

        //sort
        Arrays.sort(a);
        Arrays.sort(b);

        int ans = 0;

        for(int i = 0; i < a.length; i++) {
            ans += Math.abs(a[i] - b[i]);
        }

        return ans;


    }

}
