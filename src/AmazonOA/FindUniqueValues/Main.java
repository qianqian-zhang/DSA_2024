package AmazonOA.FindUniqueValues;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 3, 5, 6};
        int[] arr2 = {1, 1,1,1,1,1};
        int[] arr3 = {1, 100, 10, 1000};

        FindUniqueValues solution = new FindUniqueValues();

        System.out.println(solution.findUniqueValues(arr));
        System.out.println(solution.findUniqueValues(arr2));
        System.out.println(solution.findUniqueValues(arr3));
    }
}
