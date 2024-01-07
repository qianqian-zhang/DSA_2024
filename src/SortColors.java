public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        printArr(arr);
    }

    public static void sortColors(int[] arr) {
        //0,0,1,1,2,2
        //two pointers at start and end to assign 0 and 2, one pointer to iterate, one pass

        int n = arr.length;
        int start = -1;
        int end = n - 1;
        int cur = 0;

        while(start < end && cur <= end) {
            if(arr[cur] == 0) {
                start++;
                swap(arr, start, cur);
                cur++;
            }else if(arr[cur] == 2) {
                swap(arr, end, cur);
                end--;
            }else {
                cur++;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArr(int[] arr) {
        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}
