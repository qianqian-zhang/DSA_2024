package RiceBags;

import java.util.HashSet;

public class RiceBags {

    public int maxSetSize(int[] riceBags) {
        // given an array
        //sorted
        //find longest sequence meets condition
        //r[i] * r[i] == r[i + 1]

        // Arrays.sort(riceBags);

        HashSet<Integer> set = new HashSet<>();

        for(int n : riceBags) {
            set.add(n);
        }
        int ans = 0;
        //find possible start of sequence
        for(int i = 0; i < riceBags.length; i++) {
            int sq = (int)Math.sqrt(riceBags[i]);

            if(sq * sq != riceBags[i] || !set.contains(sq)) {
                //possible start of sequence
                int count = 1;
                int cur = riceBags[i];
                while(set.contains(cur * cur)) {
                    count++;
                    cur = cur * cur;
                }
                ans = Math.max(ans, count);

            }


        }

        //2,4,5,25,625
        return ans;
    }

}
