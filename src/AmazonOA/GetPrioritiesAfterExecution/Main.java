package AmazonOA.GetPrioritiesAfterExecution;

public class Main {
    public static void main(String[] args) {
        GetPriorityAfterExecution soluiton = new GetPriorityAfterExecution();
        int[] ans = soluiton.getPrioritiesAfterExecution(new int[]{6, 6, 6, 1, 2, 2});

        for(int a : ans) System.out.print(a + ", ");

        System.out.println();

        int[] ans2 = soluiton.getPrioritiesAfterExecution(new int[]{4, 4, 2, 1});

        for(int a : ans2) System.out.print(a + ", ");

        System.out.println();

        int[] ans3 = soluiton.getPrioritiesAfterExecution(new int[]{2, 1, 5, 10, 10, 1});

        for(int a : ans3) System.out.print(a + ", ");
    }
}

//Input:  priority = [6, 6, 6, 1, 2, 2]
//        Output: [3, 6, 0]
//
//priority = [4, 4, 2, 1]
//        Output: [0]
//
//Input:  priority = [2, 1, 5, 10, 10, 1]
//        Output: [0, 1]
