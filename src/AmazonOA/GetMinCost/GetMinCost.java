package AmazonOA.GetMinCost;

import java.util.PriorityQueue;

public class GetMinCost {

    public int getMinimumCost(int[] a, int[] b, int m) {
        // write your code here
        //j is the ith purchase of ONE type
        //we need to purchase m items

        //greedy???
        int n = a.length;
        //sort by price in ascending order
        PriorityQueue<int[]> pq = new PriorityQueue<>((a1, b1) -> (a1[0] + (a1[2] - 1) * a1[1]) - (b1[0] + (b1[2] - 1) * b1[1]));

        for(int i = 0; i < n; i++) {
            //node, item info
            //number of itmes purchased of this category
            //a[i] + (j - 1) * b[i]
            //[a[i], b[i], j]

            pq.offer(new int[]{a[i], b[i], 1});
        }

        int min = 0;

        while(m > 0) {
            m--;

            int[] node = pq.poll();

            int price = node[0] + (node[2] - 1) * node[1];
            min += price;

            node[2]++;

            pq.offer(node);
        }

        return min;

    }

}
