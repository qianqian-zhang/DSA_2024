import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {2,1,14,12};
        int[] arr2 = {11,7,13,6};
        System.out.println(maxScore(arr1, arr2, 3));

    }
    

    public static long maxScore(int[] nums1, int[] nums2, int k) {
        //sum of num1 * min of nums2  --> find max
        //of length k
        int n = nums1.length;
        long max = Long.MIN_VALUE;
        PriorityQueue<Integer> q1 = new PriorityQueue<>((a, b) -> nums1[b] - nums1[a]);
        PriorityQueue<Integer> q2 = new PriorityQueue<>((a, b) -> nums2[b] - nums2[a]);

        for(int j = 0; j < nums1.length; j++) {
            q1.add(j);
        }
        for(int j = 0; j < nums2.length; j++) {
            q2.add(j);
        }

        while(!q1.isEmpty() || !q2.isEmpty()) {
            int i = 0;
            int[] arr = new int[k];
            while(i < k && (!q1.isEmpty() || !q2.isEmpty())) {
                if(q1.isEmpty()) {
                    arr[i++] = nums2[q2.poll()];
                }else if(q2.isEmpty()) {
                    arr[i++] = nums1[q1.poll()];
                }else{
                    if(nums1[q1.peek()] >= nums2[q2.peek()]) {
                        arr[i++] = q1.poll();
                    }else{
                        arr[i++] = q2.poll();
                    }
                }
            }

            long score = calc(arr, nums1, nums2);

            if(score > max) max = score;
        }

        return max;
    }

    private static long calc(int[] arr, int[] nums1, int[] nums2) {
        long sum = 0l;
        long min = Long.MAX_VALUE;
        for(int index : arr) {
            if(nums2[index] < min) min = nums2[index];

            sum += nums1[index];
        }

        return sum * min;
    }
}


