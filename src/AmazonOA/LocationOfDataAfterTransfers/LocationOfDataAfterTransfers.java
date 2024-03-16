package AmazonOA.LocationOfDataAfterTransfers;
import java.util.*;
public class LocationOfDataAfterTransfers {

    public int[] locationOfDataAfterTransfers(int[] locations, int[]movedFrom, int[]movedTo) {
        // write your code here
        int n = locations.length;
        int m = movedFrom.length;

        List<Integer> list = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();
        for(int l : locations) {
            set.add(l);
        }

        for(int i = 0; i < m; i++) {
            set.remove(movedFrom[i]);
            set.add(movedTo[i]);
        }

        for(int el : set) list.add(el);

        Collections.sort(list);

        int p = list.size();
        int[] arr = new int[p];
        for(int i = 0; i < p; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

//1 - 2
//7 - 9
//2 - 5
//[5, 9, 6, 8]//uion find
// HashMap<Integer, Integer> map = new HashMap<>();

// for(int i = 0; i < n; i++) {
//   map.put(locations[i], locations[i]);
// }

// for(int i = 0; i  < m; i++) {
//   int dest = find(map, movedFrom[i]);
//   map.put(dest, movedTo[i]);
// }

// for()

}
