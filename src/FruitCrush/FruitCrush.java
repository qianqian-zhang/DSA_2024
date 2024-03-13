package FruitCrush;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FruitCrush {
    //given an array, you can pick two unequal integers and remove them
    //return the min number of integers left

    //3,3,1,1,2
    //pick 3, 1: 3,1,2
    //pick 3,1: 2
    //ans = 1

    //frequency in maxheap
    //5,2,2,2,2
    //3,2,2,2
    //2,2,1
    //1

    //4,3,2
    //2,1

    //pick integers with most frequency

    //1. get frequency of unique integers, put in maxheap
    public int fruitCrush(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for(int val : map.values()) {
            maxHeap.offer(val);
        }

        while(maxHeap.size() > 1) {
            int freq1 = maxHeap.poll();
            int freq2 = maxHeap.poll();

            freq1--;
            freq2--;

            if(freq1 > 0) {
                maxHeap.offer(freq1);
            }

            if(freq2 > 0) {
                maxHeap.offer(freq2);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();

    }
}
