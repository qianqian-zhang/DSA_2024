package AmazonOA.WarehouseDistribution;

import java.util.PriorityQueue;

//given an array of size n
//we want to minimize the difference between the max and min elements
//we can do that by the following operation: pick two elements, decrement one by 1, increment the other by 1
//find the minimum number of operations needed to meet the requirement
public class WarehouseDistribution {
    //two pq
    public long warehouseDis(int[] boxes) {
        //time complexity: o(nlogn)
        //space complexity:o(n)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for(int box : boxes) { //nlog(n)
            minHeap.offer(box);
            maxHeap.offer(box);
        }

        long ans = 0l;

        while(maxHeap.peek() - minHeap.peek() > 1) { //o(max - min)
            ans++;
            int min = minHeap.poll();
            int max = maxHeap.poll();

            minHeap.offer(min + 1);
            maxHeap.offer(max - 1);
        }

        return ans;
    }

    //the two pointer approach IS WRONG!!!!!
//    public long warehouseSort(int[] arr) {
//        //[1,4,2,6]
//        //after all operations, the diff = max - min = 0 or 1 <= 1
//        //key is to keep track of dynamically changing min and max
//
//        //sort
//        Arrays.sort(arr);
//        //[1,2,4,6]
//
//        //use two pointers
//        int n = arr.length;
//        int left = 0; //track the current min element
//        int right = n - 1; //track the current max element
//
//        long count = 0l;
//        while(left < right && arr[right] - arr[left] > 1) {
//            //operation
//            count++;
//            arr[left]++;
//            arr[right]--;
//
//            //check if it is current min and max
//            if(arr[left] > arr[left + 1]) {
//                left++;
//            }
//
//            if(arr[right] < arr[right - 1]) {
//                right--;
//            }
//        }
//
//        return count;
//
//
//    }

    //math
    public long warehouseMath(int[] arr) {
        //[1,2,4,6]
        //average distribution on every index
        //sum / n (lesser of the max and min elements if the diff = 1)
        int n = arr.length;
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }

        int avg = sum / n;

        System.out.println("avg: " + avg);

        //final min and max: avg, avg + 1
        //iterate the arr, for elements < avg, get operations needed to increments these elemetns
        //for elements > avg + 1, get number of ops to decrement these elements
        long less_count = 0l;
        long greater_count = 0l;

        for(int num : arr) {
            System.out.println("current num: " + num);
            if(num < avg) {
                less_count += avg - num;
            }

            if(num > avg + 1) {
                greater_count += num - avg - 1;
            }
        }

        System.out.println("less: " + less_count);
        System.out.println("more: " + greater_count);

        //i dont know how to prove it
        return Math.max(less_count, greater_count);
    }
}


