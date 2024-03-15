package GetDiscountPairs;

import java.util.HashMap;
import java.util.Map;

public class GetDiscountPairs {

    public int getDiscountPairs(int x, int[] prices) {
        // write your code here
        int n = prices.length;
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int sum = prices[i] + prices[j];

                if(sum % x == 0) count++;
            }
        }

        return count;
    }

    public int getDiscountPairs2(int x, int[] prices) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int p : prices) {
            map.put(p, map.getOrDefault(p, 0) + 1);

            min = Math.min(min, p);
            max = Math.max(max, p);
        }

        int lo = 2 * min;
        int hi = 2 * max;
        int ans = 0;
        for(int p : map.keySet()) {

            for(int i = lo; i <= hi; i++) {
                int element = i - p;
                if(element == p) {
                    if (map.get(p) > 1) ans += map.get(p) * (map.get(p) - 1);
                }else if(i % x == 0 && map.containsKey(i - p)) {
                    ans += map.get(p) * map.get(i - p);
                    System.out.println("pair: " + p + "-" + (i - p));
                }
            }
        }

        return ans / 2;



    }

    //We want to calculate a target value where x = (price % x) + target.
    // You can re-arrange this so x - (price % x) = target.
    // The number of times that target value has occurred previously in the array is the number of pairs that we can form with a given price.
    // We keep track of the frequency of each potential target value using a hashmap.

    public int getDiscountPairs3(int x, int[] prices) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int res = 0;
        for (int price : prices) {
            res += cnt.getOrDefault(x - price % x, 0);
            cnt.put(price % x, cnt.getOrDefault(price % x, 0) + 1);
        }
        return res;
    }

}
