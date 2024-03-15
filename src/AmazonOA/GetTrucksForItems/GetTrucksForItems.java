package AmazonOA.GetTrucksForItems;
import java.util.*;
public class GetTrucksForItems {

    public int[] getTrucksForItems(int[] trucks, int[] items) {
        // write your code here
        //map items to smallest truck > item
        //return array of m, arr[i] = index of the truck
        int n = trucks.length;
        int m = items.length;

        int[] ans = new int[m];

        //sort trucks array
        //find smallest capacity > item
        //use hashmap to get its original index

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) { //o(N)
            if(map.isEmpty() || !map.containsKey(trucks[i])) {
                map.put(trucks[i], i); //first index
            }
        }

        Arrays.sort(trucks);//o(nlogn)

        for(int i = 0; i < m; i++) { //o(mn)
            int cap = -1;
            int item = items[i];

            for(int t : trucks) {
                if(t > item) {
                    cap = map.get(t);
                    break;
                }
            }

            ans[i] = cap;
        }

        return ans;
    }

}

