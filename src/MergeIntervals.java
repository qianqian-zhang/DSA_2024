import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };


        for (int[] interval : mergeIntervals(intervals)) {
            System.out.print(Arrays.toString(interval) + " ");
        }

        System.out.println();
        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
        print2D(arr);
        printIntervals(mergeIntervals(intervals));

    }

    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        //sort intervals by element[0] ascending
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //stack
        Stack<int[]> stack = new Stack<>();
        stack.push(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] pre = stack.peek();
            int[] cur = intervals[i];

            if (pre[1] < cur[0]) {
                stack.push(cur);
            } else {
                pre[1] = Math.max(pre[1], cur[1]);
            }
        }

        int size = stack.size();
        int[][] ans = new int[size][2];

        for (int i = size - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }

    public static void print2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printIntervals(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i][0] + ", " + arr[i][1] + "]" + " ");
        }
    }
}
