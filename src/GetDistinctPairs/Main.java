package GetDistinctPairs;

public class Main {
    public static void main(String[] args) {
        GetDistinctPairs solution = new GetDistinctPairs();

        int[] arr = {5, 7, 9, 13, 11, 6, 6, 3, 3};
        int target = 12;

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target1 = 11;

        System.out.println(solution.getDistinctPairs(arr, target));
        System.out.println(solution.getDistinctPairs(arr1, target1));
    }
}
