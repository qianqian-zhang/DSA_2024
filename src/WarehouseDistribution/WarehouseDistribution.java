package WarehouseDistribution;

import java.util.PriorityQueue;

//given an array of size n
//we want to minimize the difference between the max and min elements
//we can do that by the following operation: pick two elements, decrement one by 1, increment the other by 1
//find the minimum number of operations needed to meet the requirement
public class WarehouseDistribution {
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
}


