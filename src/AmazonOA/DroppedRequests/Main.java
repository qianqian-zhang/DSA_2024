package AmazonOA.DroppedRequests;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DroppedRequests solution = new DroppedRequests();

        System.out.println(solution.droppedRequests(Arrays.asList(new Integer[]{1, 1, 1, 1, 2})));
        System.out.println(solution.droppedRequests(Arrays.asList(new Integer[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7})));
        System.out.println(solution.droppedRequests(Arrays.asList(new Integer[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 7, 7, 11, 11, 11, 11})));

    }
}
//Input:  requestTime = [1, 1, 1, 1, 2]
//        Output: 1
//
//
//        Input:  requestTime = [1, 1, 1, [1], 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7]
//        Output: 2
//
//
//        Input:  requestTime = [1, 1, 1, [1], 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, [7], [7], 11, 11, [11,] [11]]
//        Output: 5
