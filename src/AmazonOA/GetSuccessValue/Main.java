package AmazonOA.GetSuccessValue;

public class Main {
    public static void main(String[] args) {
        GetSuccessValue solution = new GetSuccessValue();
        int[] num1 = new int[]{2, 5, 6, 3, 5};
        int[] q1 = new int[]{2,3,5};
        int[] ans1 = solution.getSuccessValue(q1, num1);
        for(int a : ans1) System.out.print(a + ", ");
        System.out.println();

        int[] num2 = new int[]{7,3,5,2};
        int[] q2 = new int[]{1,4};
        int[] ans2 = solution.getSuccessValue(q2, num2);
        for(int a : ans2) System.out.print(a + ", ");
        System.out.println();

        int[] num3 = new int[]{7,5,6};
        int[] q3 = new int[]{1,2,3};
        int[] ans3 = solution.getSuccessValue(q3, num3);
        for(int a : ans3) System.out.print(a + ", ");
        System.out.println();
    }
}

//Input:  num_viewers = [2, 5, 6, 3, 5], queries = [2, 3, 5]
//        Output: [11, 16, 21]

//        Input:  num_viewers = [7, 3, 5, 2], queries = [1, 4]
//        Output: [7, 17]

//        Input:  num_viewers = [7, 5, 6], queries = [1, 2, 3]
//        Output: [7, 13, 18]
//        Explanation:
//
//
//        For the first query, k = 1, only the top region is used for the success value.
//
//        For the second query, k = 2, only the top 2 regions are used.
//
//        For the third query, k = 3, all 3 regions are used.
//
//
//        Return [7, 13, 18].
//