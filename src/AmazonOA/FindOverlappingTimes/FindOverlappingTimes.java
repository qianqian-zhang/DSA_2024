package AmazonOA.FindOverlappingTimes;
import java.util.*;
public class FindOverlappingTimes {

    public int[][] findOverlappingTimes(int[][] intervals) {
        // write your code here

        //merge intervals
        //return them sorted in ascending order by start time

        //sort by start time in ascending order
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        Stack<int[]> stack = new Stack<>();
        int n = intervals.length;
        stack.add(intervals[0]);

        for(int i = 1; i < n; i++) {
            int[] interval = intervals[i];
            int[] prev = stack.peek();

            //if does not overlap
            if(interval[0] > prev[1]) {
                stack.add(interval);
            }else{
                //overlap, modify peek
                prev[1] = Math.max(prev[1], interval[1]);
            }

        }

        int m = stack.size();

        int[][] ans = new int[m][2];

        for(int i = m - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;

    }

}
