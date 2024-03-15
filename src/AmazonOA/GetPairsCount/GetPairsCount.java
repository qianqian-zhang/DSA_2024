package AmazonOA.GetPairsCount;

import java.util.HashMap;

public class GetPairsCount {
    // given an array
    //find number of pairs with difference at most k

    public long getPairsCount(int[] process, int k) {
        //bruteforce
        long count = 0l;
        int n = process.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int diff = Math.abs(process[i] - process[j]);

                if(diff <= k) count++;
            }
        }

        return count;
    }

    public long getPairsCountHashing(int[] process, int k) {
        //there can be duplicate elements

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int p : process) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        long count = 0l;
        for(int pro : process) {
            //[pro, pro + k]
            int freq = map.get(pro);
            count += (long)freq * (freq - 1) / 2;
            for(int i = pro + 1; i <= pro + k; i++) {
                if(map.containsKey(i)) {
                    count += (long)freq * map.get(i);
                }
            }
        }

        return count;


    }

}
