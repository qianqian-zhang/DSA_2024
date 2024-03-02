package GetScoreDiff;

import java.util.Arrays;

public class GetScoreDiff {
    public long getScoreDiff(int n, int[] points) {
        long player1 = 0l;
        long player2 = 0l;

        Arrays.sort(points);

        boolean flag = true;

        for(int i = n - 1; i >= 0; i--) {
            if(flag) {
                player1 += points[i];
            }else{
                player2 += points[i];
            }

            flag = !flag;
        }

        return Math.abs(player1 - player2);
    }
}
