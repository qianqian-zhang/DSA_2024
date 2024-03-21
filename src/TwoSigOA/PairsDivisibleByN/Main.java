package TwoSigOA.PairsDivisibleByN;

public class Main {
    public static void main(String[] args) {
        PairsDivisibleByN solution = new PairsDivisibleByN();
        System.out.println(solution.sumBeingAbletoBeDivisibleByN(3, new int[]{5, 4, 3, 2, 1}));
    }
}
//Input:  N = 3, arr = [5, 4, 3, 2, 1]
//        Output: 4
//        Explanation:
//
//        We can that there are FOUR pairs that meet the criteria outlined in task 1 through task 3 above 👆
//
//        arr[0] + arr[1] = 1 + 2 = 3, 3 ➗ 3 = 1
//
//        arr[0] + arr[4] = 1 + 5 = 6, 6 ➗ 3 = 2
//
//        arr[1] + arr[3] = 2 + 4 = 6, 6 ➗ 3 = 2
//
//        arr[3] + arr[4] = 4 + 5 = 9, 9 ➗ 3 = 3
//
//        So, 4 should be returned.
//
//        For original prompt, pls refer source image.