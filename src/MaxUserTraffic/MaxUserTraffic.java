package MaxUserTraffic;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxUserTraffic {


    public int maximumUserTraffic(int[] login, int[] logout) {
        //given a set of intervals
        //find out at one given moment, when the maximum amount of intervals are overlapping, the maximum length of the overlap

//       [         ]
//    [         ]
// [        ]

        int n = login.length;

        //MEETING ROOM
        int[][] intervals = new int[n][n];
        for(int i = 0; i < n; i++) {
            intervals[i][0] = login[i];
            intervals[i][1] = logout[i];
        }
        //sort arrays by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0; //maximum traffic
        int days = 0;
        for(int i = 0; i < n; i++){

            while(!pq.isEmpty() && pq.peek() < intervals[i][0]) {
                pq.poll();
            }

            pq.offer(intervals[i][1]);

            if(pq.size() > count) {
                days = pq.peek() - intervals[i][0] + 1;
                count = pq.size();
            }else if(pq.size() == count) {
                days = Math.max(days, pq.peek() - intervals[i][0] + 1);
            }



        }

        return days;


    }

}
