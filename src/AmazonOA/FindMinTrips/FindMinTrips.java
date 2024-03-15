package AmazonOA.FindMinTrips;

import java.util.HashMap;

public class FindMinTrips {


    public int findMinTrips(int[] packageweight) {
        // write your code here

        //get number of each unique weight
        //pick two or three in a trip
        //MINIMUM trips
        //divisable by 2
        //divisabe by 3
        //2 * k + 3 * m = weight

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int weight : packageweight) {
            map.put(weight, map.getOrDefault(weight, 0) + 1);
        }

        int ans = 0;
        for(int value : map.values()) {
            int remainder = value % 3;
            if(remainder == 0) {
                ans += value / 3;
            }else if(remainder == 1){
                int factor = value / 3;
                if(factor == 0) return -1;

                ans += factor - 1;
                value -= (factor - 1) * 3;
                ans += value / 2;
            }else if(value % 2 == 0) {
                ans += value / 2;
            }else{
                return -1;
            }
        }

  return ans;
}

//6
//6 / 3 = 2
//8 / 3 = 2
    }

//6
//6 / 3 = 2
//8 / 3 = 2

