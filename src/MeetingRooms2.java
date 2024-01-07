import java.util.Arrays;

public class MeetingRooms2 {
    public static void main(String[] args) {
        int[][] intervals = {{0,30}, {5,10}, {15,20}};

        System.out.println(minRooms(intervals));
    }

    public static int minRooms(int[][] intervals) {
        //base case
        int n = intervals.length;
        if(n == 1) return 1;

        //sort start times and end times in two arrays
        int[] start = new int[n];
        int[] end = new int[n];
        int k = 0;

        for(int[] interval : intervals) {
            start[k] = interval[0];
            end[k] = interval[1];
            k++;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        //iterate two arrays
        // count maximum streak of start times, decrement when there is an ending time
        int count = 0;
        int maxCount = 0;

        for(int i = 0, j = 0; i < n;) {
            if(start[i] < end[j]) {
                count++;
                i++;
            }else{
                count--;
                j++;
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}
