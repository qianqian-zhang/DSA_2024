package AmazonOA.MaxUserTraffic;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class MaxUserTraffic {


    public int maximumUserTraffic(int[] login, int[] logout) {
        //given a set of intervals
        //find out at one given moment, when the maximum amount of intervals are overlapping,
        //get the sum of durations of maximum overlap
        //overlapping: both start and end are inclusive

        int n = login.length;

        //MEETING ROOM
        int[][] intervals = new int[n][n];
        for(int i = 0; i < n; i++) {
            intervals[i][0] = login[i];
            intervals[i][1] = logout[i];
        }
        //sort arrays by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //store end times in ascending order
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0; //maximum number of intervals overlapping
        int days = 0; //length of overlap
        for(int i = 0; i < n; i++){

            while(!pq.isEmpty() && pq.peek() < intervals[i][0]) {
                pq.poll();
            }

            pq.offer(intervals[i][1]);
            //pa stores overlapping intervals
            if(pq.size() > count) {
                days = pq.peek() - intervals[i][0] + 1;
                count = pq.size();
            }else if(pq.size() == count) {
                days += pq.peek() - intervals[i][0] + 1;
            }

        }

        return days;


    }

    public int maxUserTraffic(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);
        int maxOverlap = 0;
        int overlap = 0;
        int ans = 0;
        int n = start.length;
        int i = 0;
        int j = 0;

        while(j < n && i < n) {
            int endTime = end[j];
            int startTime = start[i];
            if(start[i] > end[j]) {
                //release end
                overlap--;
                j++;
            }else {
                overlap++;
                i++;
            }
            if(overlap > maxOverlap) {
                maxOverlap = overlap;
                ans = endTime - startTime + 1;
            }else if(overlap == maxOverlap) {
                ans += endTime - startTime + 1;
            }

        }

        return ans;
    }

    public static int maximumUserTrafficTreeMap(int[] login, int[] logout) {
        Map<Integer, Integer> events = new TreeMap<>();
        for (int start : login) {
            events.put(start, events.getOrDefault(start, 0) + 1);
        }
        for (int end : logout) {
            events.put(end, events.getOrDefault(end, 0) - 1);
        }
        int maxTraffic = 0;
        int maxTrafficDuration = 0;
        int curLoggedIn = 0;
        int prevTime = 0;
        for (var event : events.entrySet()) {
            int time = event.getKey();
            int count = event.getValue();
            if (curLoggedIn > maxTraffic) {
                maxTraffic = curLoggedIn;
                maxTrafficDuration = time - prevTime + 1;
            } else if (curLoggedIn == maxTraffic) {
                maxTrafficDuration += time - prevTime + 1;
            }
            prevTime = time;
            curLoggedIn += count;

        }
        return maxTrafficDuration;
    }

}