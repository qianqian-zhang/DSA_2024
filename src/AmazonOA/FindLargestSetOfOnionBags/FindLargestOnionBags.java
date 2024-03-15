package AmazonOA.FindLargestSetOfOnionBags;

import java.util.Arrays;
import java.util.HashMap;

public class FindLargestOnionBags {

    public int findLargestSet(int[] onionBags) {
        // write your code here

        //p[i] * p[i] = p[i + 1]

        Arrays.sort(onionBags);
        int n = onionBags.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int count = 1;
            int cur = onionBags[i];

            for(int j = i + 1; j < n; j++) {
                if(cur * cur == onionBags[j]) {
                    cur = onionBags[j];
                    count++;
                }
            }

            if(count > 1) ans = Math.max(count, ans);
        }

        return ans;

    }

//2,3,4,9,16

    public int findLargestSetHashMap(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for(int n : arr) {
            int sq = (int)Math.sqrt(n);

            if(map.containsKey(sq) && sq * sq == n) {
                map.put(n, map.get(sq) + 1);
            }else{
                map.put(n, 1);
            }

            if(map.get(n) > 1) ans = Math.max(ans, map.get(n));
        }

        return ans;

    }
}
