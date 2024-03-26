package SnowflakeOA.MeetingAssistant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeetingAssistant {

    public String getEarliestMeetTime(String[] events, int k) {
        // write your code here
        // [     ]
        //[      ]
        //          [  ]
        //given intervals
        //merge them
        //find gaps

        //24 hours, * 60
        //[0, 24 * 60]
        int n = events.length;
        int[][] intervals = new int[n][2];
        int idx = 0;
        for(String event : events) {
            String[] arr = event.split(" ");
            String start = arr[2];
            String end = arr[3];

            int[] inter = new int[]{convertToMin(start), convertToMin(end)};
            intervals[idx++] = inter;
        }

        //merge intervals
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//        for(int[] inter : intervals) System.out.println("[" + inter[0] + ", " + inter[1] + "]");
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for(int i = 1; i < n; i++) {
            int[] prev = list.get(list.size() - 1);
            int[] cur = intervals[i];
            if(prev[1] < cur[0]) {
                list.add(cur);
            }else{
                prev[1] = Math.max(prev[1], cur[1]);
            }
        }
//        System.out.println("merged");
//        for(int[] inter : list) System.out.println("[" + inter[0] + ", " + inter[1] + "]");
//        //check for gaps
        //    [   ]     [     ]
        int pre_end = -1;

        for(int[] interval : list) {
            int start = interval[0];
            int gap = start - (pre_end + 1);
//            System.out.println("gap: " + gap);
            if(gap >= k) {
                //return time converted
//                System.out.println(convertToHrs(pre_end + 1));
                return convertToHrs(pre_end + 1);
            }

            pre_end = interval[1];
        }


        return pre_end == 24 * 60 ? "-1" : convertToHrs(pre_end + 1);


    }

    private int convertToMin(String time) {
        //13:00
        int hour = Integer.parseInt(time.substring(0, 2));
        int min = Integer.parseInt(time.substring(3));

        return hour * 60 + min;
    }

    private String convertToHrs(int min) {
        int hour = min / 60;
        int minutes = min % 60;
        if(hour == 24) return "-1";
        String hr = String.valueOf(hour);
        String min_ = String.valueOf(minutes);

        if(hour / 10 == 0) {
            hr = "0" + hr;
        }

        if(minutes/ 10 == 0) {
            min_ = "0" + min_;
        }

        return hr + ":" + min_;
    }

}
