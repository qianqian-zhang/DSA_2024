package MaximumFinalValue;

import java.util.Arrays;

public class MaxFinalValue {

    public int maximumFinal(int[] arr) {
        // write your code here

        //non descending

        //greedy

        //3, 1, 3, 4
        //1,2,3,4

        Arrays.sort(arr);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i - 1] > 1) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        return arr[arr.length - 1];

    }

}
