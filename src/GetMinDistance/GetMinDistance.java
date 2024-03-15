package GetMinDistance;

import java.util.Arrays;

public class GetMinDistance {

    public long getMinDistance(int[] center, int[] destination) {
        // write your code here
        int n = center.length;

        Arrays.sort(center);
        Arrays.sort(destination);
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans += Math.abs(center[i] - destination[i]);
        }

        return ans;
    }

}
