import java.util.HashMap;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        int n = arr.length;

        while(i < n) {
            //skip elements <= 0 and > n
            if(arr[i] <= 0 || arr[i] > n) {
                i++;
                continue;
            }

            int correct_index = arr[i] - 1;
            if(arr[correct_index] != arr[i]) {
                swap(arr, correct_index, i);
            }else {
                i++;
            }
        }

        for(int j = 0; j < n; j++) {
            if(arr[j] != j + 1) {
                return j + 1;
            }
        }

        return n + 1;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
