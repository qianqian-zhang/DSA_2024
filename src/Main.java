import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        Heap<Integer> minHeap = new Heap<>();

        try {
            Integer removedElement = minHeap.remove();
            System.out.println("Removed element: " + removedElement);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        minHeap.insert(1);
        minHeap.insert(8);
        minHeap.insert(4);
        minHeap.insert(3);
        minHeap.insert(7);
        minHeap.insert(5);

        ArrayList<Integer> l = minHeap.heapSort();
        System.out.println(l);//[1, 3, 4, 5，7, 8]

        int[] numSeq = {1,3,2,5,4};

        System.out.println(getScoreDiff.solution(5, numSeq));


        //player1:17, 2, 4, 1, 8, 3, 6, 5
        //player2:3
        //player1:5 [8,7,5]
        //player2:11 [5,7]
        //player1:10 [7]
        //player2:18

    }
}
