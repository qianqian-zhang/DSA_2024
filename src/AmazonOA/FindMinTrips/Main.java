package AmazonOA.FindMinTrips;

public class Main {
    public static void main(String[] args) {
        FindMinTrips solution = new FindMinTrips();

        int[] arr = {1, 8, 5, 8, 5, 1, 1};
        int[] arr2 = {3, 4, 4, 3, 1};
        int[] arr3 = {2, 4, 6, 6, 4, 2, 4};

        System.out.println(solution.findMinTrips(arr));
        System.out.println(solution.findMinTrips(arr2));
        System.out.println(solution.findMinTrips(arr3));
    }
}
