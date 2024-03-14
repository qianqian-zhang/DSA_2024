package FindLargestSetOfOnionBags;

public class Main {
    public static void main(String[] args) {
        FindLargestOnionBags solution = new FindLargestOnionBags();

        int[] arr= {3, 9, 4, 2, 16};

        System.out.println(solution.findLargestSet(arr));
        System.out.println(solution.findLargestSetHashMap(arr));
    }
}
