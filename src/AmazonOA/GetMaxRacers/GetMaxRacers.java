package AmazonOA.GetMaxRacers;

import java.util.HashSet;

public class GetMaxRacers {

    public int getMaxRacers(int[] speed, int k) {
        // write your code here

        //given an array
        //remove at most k elements
        //so that there are the most number of contiguous elements of same value

        //1,4,4,2,2,4  k = 2
        //1,4,4,4  ans = 3

        //1,2,2,1,1,2,1,1 k = 2

        //1, 2, 2,

        //sliding window?
        //max consecutive ones

        int ans = 0;

        int n = speed.length;

        int left = 0;
        int right = 0;
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for(int s : speed) {
            if(!set.contains(s)) {
                set.add(s);

                int res = slidingWindow(s, speed, k);
                max = Math.max(max, res);

            }
        }

        return max;
    }


    public int slidingWindow(int target, int[] arr, int k) {
        //given an arr
        //find longest subarray of contiguous value target, you can replace k elements value

        int n = arr.length;
        int right = 0;
        while(arr[right] != target) {
            right++;
        }
        int left = right;
        int len = 0;
        int count = 0;
        while(right < n) {
            while(right + 1 < n && (arr[right + 1] == target || count < k)) {
                if(arr[right] != target) count++;
                right++;

                if(arr[right] != target) count++;
            }

            len = Math.max(len, right - left + 1 - count);

            while(left <= right && count >= k){
                if(arr[left] != target) {
                    count--;
                }

                left++;
            }

            right++;
        }

        return len;

    }
}
