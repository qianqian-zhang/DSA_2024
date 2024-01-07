import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(countZeros(200010230, 0)); //2010

        //check if an array is sorted
        int[] arr = {3, 0, 2, 3, 4, 3};
        System.out.println("isSorted: " + isSorted(arr));

        //linear search
        System.out.println("linear search: " + search(arr, 9));
        System.out.println("find index: " + findIndex(arr, 3));
        System.out.println("find all indices: " + findAllIndex(arr, 3, 0));

    }

    private static int countZeros(int n, int res) {
        //base condition
        if(n % 10 == n) return res;

        if(n % 10 == 0) res += 1;

        return countZeros(n / 10, res);
    }

    private static boolean isSorted(int[] arr) {
        //base case
        if(arr.length <= 1) return true;

        //check if an array is sorted using recursion
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int index) {
        //base condition
        if(index == arr.length - 1) return true;

        return arr[index] <= arr[index + 1] && helper(arr, index + 1);

    }

    private static boolean search(int[] arr, int target) {
        //find if there is a target in arr using recursion
        return searchHelper(arr, target, 0);
    }

    private static boolean searchHelper(int[] arr, int target, int index) {
        //base condition
        if(index == arr.length) return false;

        return arr[index] == target || searchHelper(arr, target, index + 1);
    }

    private static int findIndex(int[] arr, int target) {
        //return index of target, if none, return -1
        return findIndexHelper(arr, target, 0);
    }

    private static int findIndexHelper(int[] arr, int target, int index) {
        //base condition
        if(index == arr.length) return -1;

        if(arr[index] == target) return index;

        return findIndexHelper(arr, target, index + 1);
    }

    static List<Integer> list = new ArrayList<>();

    private static List<Integer> findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length) return list;

        if(arr[index] == target) list.add(index);

        return findAllIndex(arr, target, index + 1);
    }
}
