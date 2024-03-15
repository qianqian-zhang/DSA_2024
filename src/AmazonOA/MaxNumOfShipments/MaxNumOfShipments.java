package AmazonOA.MaxNumOfShipments;

public class MaxNumOfShipments {

    public int maxNumberOfBalancedShipments(int[] weights) {
        //given an array
        //partition array into subarrays
        //each subarray, last element cannot be max of that subarray
        //return maximum number of subarrays you can partition

        //GREEDY
        int n = weights.length;
        int max_so_far = -1;
        int count = 0;
        int lastValidMax = -1;
        int lastPartition = -1;
        for(int i = 0; i < n; i++) {
            if(max_so_far == -1) {
                max_so_far = weights[i];
            }else{
                if(weights[i] < max_so_far) {
                    //break partition
                    count++;
                    lastValidMax = max_so_far;
                    max_so_far = -1;
                    lastPartition = i;
                }else{
                    max_so_far = weights[i];
                }
            }
        }
        //tailing elements
        for(int i = lastPartition + 1; i < n; i++) {
            if (weights[i] >= lastValidMax) return 0;
        }

        return count;
    }

//1, 2, 3, 2, 6, 3
//

}
