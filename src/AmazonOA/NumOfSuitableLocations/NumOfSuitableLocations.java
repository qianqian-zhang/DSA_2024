package AmazonOA.NumOfSuitableLocations;

import java.util.Arrays;
import java.util.HashSet;

public class NumOfSuitableLocations {

    public int numberOfSuitableLocations(int[] center, int d) {
        // bruteforce can only pass half of the test cases

        //2 * distance <= d

        d /= 2;
        Arrays.sort(center);

        //-4, 0, 2, 3
        int n = center.length;
        //range[center[0] - d /=2]
        int l = center[0] - d;
        int r = center[n - 1] + d;
        int ans = 0;
        for(int i = l; i <= r; i++) {
            if(canDeliver(center, i, d)) ans++;
        }

        return ans;

    }

    public boolean canDeliver(int[] c, int x, int d) {
        int dis = 0;
        for(int n : c) {
            dis += Math.abs(n - x);
        }

        return dis <= d;
    }

    public int numberOfSuitableLocations2(int[] center, int d) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int c : center) {
            if(c < min) min = c;
            if(c > max) max = c;
        }

        d /= 2;

        int left = min - d;
        int right = max + d;
        int[] res = {0};
        find(center, left, right, d, res);

        return res[0];
    }

    public void find(int[] c, int l, int r, int d, int[] res) {
        if(l <= r) {
            int m = l + (r - l) / 2;

            if(canDeliver(c, m, d)) res[0]++;

            find(c, l, m - 1, d, res);
            find(c, m + 1, r, d, res);
        }
    }

    public int numOfSuitableLocationsLinear(int[] center, int d) {
        //从最左边的那个点左方距离target除以2的地方开始
        //计算此刻到所有点的距离sum
        // 然后从这个点依次向右走每往右走一个点sum减去1*right_count
        // 如果遇到一个仓库right_count-1left_cout+1那么继续往右走的时候sum-1*right_count+1*left_count
        // 用这样的方法一直走到sum*2==target在走的过程中计数复杂度是linear

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int c : center) {
            if(c < min) min = c;
            if(c > max) max = c;

            set.add(c);
        }

        d /= 2;
        //[min - d, max + d]
        int sum = 0;
        for(int c : center) {
            sum += c - min + d;
        }
        int rightCount = center.length;
        int leftCount = 0;
        int ans = 0;
        for(int i = min - d; i <= max + d; i++) {
            if(sum <= d) ans++;

            if(set.contains(i)) {
                //encounter a warehouse
                rightCount--;
                leftCount++;
            }

            sum -= rightCount;
            sum += leftCount;


        }

        return ans;
    }

}
