package AmazonOA.LocationOfDataAfterTransfers;

import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LocationOfDataAfterTransfers solution = new LocationOfDataAfterTransfers();
        List<int[]> locations = new ArrayList<>();
        List<int[]> movedFrom = new ArrayList<>();
        List<int[]>movedTo = new ArrayList<>();

        locations.add(new int[]{1, 7, 6, 8});
        locations.add(new int[]{1, 5, 2, 6});
        locations.add(new int[]{1, 2, 3});

        movedFrom.add(new int[]{1,7,2});
        movedFrom.add(new int[]{1, 4, 5, 7});
        movedFrom.add(new int[]{1, 2});

        movedTo.add(new int[]{2,9,5});
        movedTo.add(new int[]{4,7,1,3});
        movedTo.add(new int[]{5,6});

        for(int i = 0; i < 3; i++) {
            int[] ans = solution.locationOfDataAfterTransfers(locations.get(i), movedFrom.get(i), movedTo.get(i));
            for(int a : ans) System.out.print(a + ", ");
            System.out.println("****");


        }
    }
}

//
//Input:  locations = [1, 7, 6, 8], movedFrom = [1, 7, 2], movedTo = [2, 9, 5]
//        Output: [5, 6, 8, 9]
//        Explanation:
//
//
//        Data begins at locations listed in locations. Over the course of the year, the data was moved three times.
//
//        Data was first moved from movedFrom[0] to movedTo[0], from 1 to 2. Next, it is moved from 7 to 9, and finally from location 2 to 5.
//
//        In the end, the locations where data is present are [5,6,8,9] in ascending order.
//
//        Example 2:
//
//        Input:  locations = [1, 5, 2, 6], movedFrom = [1, 4, 5, 7] , movedTo = [4, 7, 1, 3]
//        Output: [1, 2, 3, 6]
//        Explanation:
//
//
//        N/A (This example is a sample test case :)
//
//        Example 3:
//
//        Input:  locations = [1, 2, 3], movedFrom = [1, 2], movedTo = [5, 6]
//        Output:  [3, 5, 6]
//        Explanation: