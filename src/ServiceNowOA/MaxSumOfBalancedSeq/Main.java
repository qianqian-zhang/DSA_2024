package ServiceNowOA.MaxSumOfBalancedSeq;

public class Main {
    public static void main(String[] args) {
        MaxSumOfBalancedSequence solution = new MaxSumOfBalancedSequence();
        System.out.println(solution.maxSumOfBalancedSubsequence(new int[]{1,2,3}));
    }
}
//    You are given a 0-indexed integer array nums.
//
//        A subsequence of nums having length k and consisting of indices i0 < i1 < ... < ik-1 is balanced if the following holds:
//
//        nums[i] - nums[i-1] == i - (i-1),
//
//        A subsequence of nums having length 1 is considered balanced.
//
//        Return an integer denoting the maximum possible sum of elements in a balanced subsequence of nums.
//
//        A subsequence of an array is a new non-empty array that is formed from the original array by deleting some (possibly none) of the elements without disturbing the relative positions of the remaining elements.
//
//        Example 1:
//
//        Input:  nums = [1, 2, 3]
//        Output: 6
//        Explanation:
//
//        Explanation not found 👉👈
//
//        Example 2:
//
//        Input:  nums = [3, 2, 1]
//        Output: 3
//        Explanation:
//
//        Explanation not found 👉👈
//