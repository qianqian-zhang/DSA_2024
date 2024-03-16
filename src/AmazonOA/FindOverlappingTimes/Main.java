package AmazonOA.FindOverlappingTimes;

public class Main {
    public static void main(String[] args) {
        FindOverlappingTimes solution = new FindOverlappingTimes();

        int[][] arr = {{7, 7}, {2, 3}, {6, 11}, {1, 2}};

        int[][] ans = solution.findOverlappingTimes(arr);

        for(int[] a : ans) {
            System.out.println("[" + a[0] + ", " + a[1] + "]");
        }
    }
}
