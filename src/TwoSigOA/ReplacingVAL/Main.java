package TwoSigOA.ReplacingVAL;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 0, 0, 0}, {1, 1, 1, 0, 0}, {1, 1, 0, 0, 0}, {0, 1, 0, 1, 0}};
        int[] pos = new int[]{1,2};
        ReplacingVal solution = new ReplacingVal();

        int[][] ans = solution.replacingNum(2, arr, pos);

        for(int[] a : ans) {
            for(int n : a) {
                System.out.print(n + " ");
            }

            System.out.println();
        }
    }
}
//Replace the val at the starting position with the provided replacing val.
// Repeat this process for all positions connected to the starting position via sides with the same val as the starting position.
//
//        Example 1:
//
//        Input:  replacingVal = 2, arr = [[0, 1, 0, 0, 0], [1, 1, 1, 0, 0], [1, 1, 0, 0, 0], [0, 1, 0, 1, 0]], pos = [1, 2]
//        Output: [[0, 2, 0, 0, 0], [2, 2, 2, 0, 0], [2, 2, 0, 0, 0], [0, 2, 0, 1, 0]]
//        Explanation:
//
//        No explanation is provided for now.
//
//        For original prompt, pls refer source image.


// [0, 1, 0, 0, 0],
// [1, 1, 1, 0, 0],
// [1, 1, 0, 0, 0],
// [0, 1, 0, 1, 0]

// [0, 2, 0, 0, 0],
// [2, 2, 2, 0, 0],
// [2, 2, 0, 0, 0],
// [0, 2, 0, 1, 0]