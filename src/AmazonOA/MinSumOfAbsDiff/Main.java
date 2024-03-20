package AmazonOA.MinSumOfAbsDiff;

public class Main {
    public static void main(String[] args) {
        MinSumOfAbsDiff solution = new MinSumOfAbsDiff();

        int[] a = {3,2,1};
        int[] b= {2,1,3};
        System.out.println(solution.minimizeSumOfAbsoluteDifferences(a, b));


        int[] a2 = {4, 1, 8, 7};
        int[] b2= {2, 3, 6, 5};
        System.out.println(solution.minimizeSumOfAbsoluteDifferences(a2, b2));
    }
}
//
//Input:  a = [3, 2, 1], b = [2, 1, 3]
//        Output: 0
//        Explanation:
//
//        1st pairing: |3 - 2| + |2 - 1| + |1 - 3| = 1 + 1 + 2 = 4
//
//        2nd pairing: |3 - 2| + |1 - 1| + |2 - 3| = 1 + 0 + 1 = 2
//
//        3rd pairing: |2 - 2| + |3 - 1| + |1 - 3| = 0 + 2 + 2 = 4
//
//        4th pairing: |1 - 2| + |2 - 1| + |3 - 3| = 1 + 1 + 0 = 2
//
//        5th pairing: |2 - 2| + |1 - 1| + |3 - 3| = 0 + 0 + 0 = 0
//
//        6th pairing: |1 - 2| + |3 - 1| + |2 - 3| = 1 + 2 + 1 = 4
//
//        Therefore, 5th pairing has minimum sum of absolute difference.
//
//        Example 2:
//
//        Input:  a = [4, 1, 8, 7], b = [2, 3, 6, 5]
//        Output: 6
//        Explanation:
//
//        The minimum sum of absolute differences can be obtained by the following pairing:
//
//        |4 - 3| + |1 - 2| + |8 - 6| + |7 - 5| = 1 + 1 + 2 + 2 = 6