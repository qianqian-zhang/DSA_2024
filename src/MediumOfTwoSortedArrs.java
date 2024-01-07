import java.util.Arrays;

public class MediumOfTwoSortedArrs {
    public static void main(String[] args) {
        int[] arr1 = {-3, 0, 2, 5, 7, 10};
        int[] arr2 = {-1, 4, 6, 8, 9, 11, 13};
        //find median of two sorted arrays
        System.out.println(findMedian(arr1, arr2));
    }

    public static double findMedian(int[] arr1, int[] arr2) {
        //merge two arrays - two pointers(merge sort)
        int i = 0, j = 0;
        int m = arr1.length;
        int n = arr2.length;

        int[] merged = new int[m + n];
        int k = 0;

        while(i < m && j < n) {
            if(arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            }else {
                merged[k++] = arr2[j++];
            }
        }

        //check if there are elements left in arr1 or arr2
        while(i < m) {
            merged[k++] = arr1[i++];
        }
        while(j < n) {
            merged[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(merged));

        //find median of sorted array
        int mid = (m + n) / 2;

        if((m + n) % 2 != 0) {
            return merged[mid];
        }else {
            return (merged[mid] + merged[mid - 1]) / 2.0;
        }
    }

}
