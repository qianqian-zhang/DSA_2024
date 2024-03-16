package AmazonOA.MinTimeSpent;

import java.util.Arrays;

public class MinTimeSpent {

    public int minimumTimeSpent(int[] comedyReleaseTime, int[] comedyDuration,
                                int[] dramaReleaseTime, int[] dramaDuration) {
        //return minimum time you can finish one comedy, and one drama

        //interval problem

        int n = comedyReleaseTime.length;
        int m = dramaReleaseTime.length;

//node = {start, end, duration, category};
//0 - comedy
//1 - drama
        int[][] arr = new int[n + m][4];
        int idx = 0;
        for(int i = 0; i < n; i++) {
            arr[idx][0] = comedyReleaseTime[i];
            arr[idx][1] = comedyReleaseTime[i] + comedyDuration[i];
            arr[idx][2] = comedyDuration[i];
            arr[idx++][3] = 0;
        }


        for(int i = 0; i < m; i++) {
            arr[idx][0] = dramaReleaseTime[i];
            arr[idx][1] = dramaReleaseTime[i] + dramaDuration[i];
            arr[idx][2] =  dramaDuration[i];
            arr[idx++][3] = 1;
        }

//sort by end time in ascending order
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        int ans = 0;
        int category = -1;
        int pre_end_time = 0;
        int pre_start_time = 0;
        for(int i = 0; i < arr.length; i++) {
            ////node = {start, end, duration, category};
            int[] info = arr[i];
            if(ans == 0) {
                category = info[3];
                ans += info[2];
                pre_end_time = info[1];
                pre_start_time = info[0];
            }else{
                if(info[3] == category) continue;
                if(info[0] <= pre_start_time) continue;

                ans = pre_end_time + info[2];
            }
        }

        return ans;

    }
//comdey [1, 4]
//drama [2, 4] --> start watching at 4 [4, 6]

//ans = 6

}
