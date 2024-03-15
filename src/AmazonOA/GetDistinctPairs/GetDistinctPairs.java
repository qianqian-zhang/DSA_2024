package AmazonOA.GetDistinctPairs;

import java.util.HashSet;

public class GetDistinctPairs {
    public int getDistinctPairs(int[] stocksProfit, int target) {
        // write your code here

        //two sum????

        int count = 0;

        //key - value
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> pairs = new HashSet<>();
        // 6 6 6 2   -- 12
        for(int i = 0; i < stocksProfit.length; i++) {
            if(pairs.contains(stocksProfit[i])) continue;

            if(set.contains(target - stocksProfit[i])) {
                pairs.add(stocksProfit[i]);
                pairs.add(target - stocksProfit[i]);

                count++;

            }

            set.add(stocksProfit[i]);
        }

        return count;
    }

}
