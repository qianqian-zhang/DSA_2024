package AmazonOA.GetScoreDiff;

public class Main {
    public static void main(String[] args) {
        GetScoreDiff solution = new GetScoreDiff();

        int[] arr = {2, 5, 7, 1, 5, 10};
        //10 + 5 + 2 = 17
        //7 + 5 + 1 = 13

        System.out.println(solution.getScoreDiff(6, arr));
        System.out.println(solution.getScoreDiff(4, new int[]{4, 1, 2, 3}));
    }
}
