package AmazonOA.GetMeanRankCount;

public class Main {
    public static void main(String[] args) {
        GetMeanRankCount solution = new GetMeanRankCount();

        int[] ans = solution.getMeanRankCount(new int[]{1, 2, 3, 4, 5});
        for(int a : ans) System.out.print(a + ", ");
        System.out.println();

        int[] ans2 = solution.getMeanRankCount(new int[]{4, 3, 2, 1});
        for(int a : ans2) System.out.print(a + ", ");
        System.out.println();

        int[] ans3 = solution.getMeanRankCount(new int[]{4, 7, 3, 6, 5, 2, 1});
        for(int a : ans3) System.out.print(a + ", ");
        System.out.println();
    }
}
//
//Input:  rank = [1, 2, 3, 4, 5]
//        Output: [1, 2, 3, 2, 1]

//
//        Input:  rank = [4, 3, 2, 1]
//        Output: [1, 2, 2, 1]
//
//        Input:  rank = [4, 7, 3, 6, 5, 2, 1]
//        Output: [1, 1, 1, 4, 4, 1, 1]
//