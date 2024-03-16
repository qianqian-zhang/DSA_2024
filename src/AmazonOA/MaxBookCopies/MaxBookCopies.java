package AmazonOA.MaxBookCopies;
import java.util.*;
public class MaxBookCopies {

    public int[] maximumBookCopies(int[] portalUpdate) {
        // write your code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        HashMap<Integer, int[]> map = new HashMap<>();
        int[] ans = new int[portalUpdate.length];
        int idx = 0;
        for(int update : portalUpdate) {
            //book
            int book = Math.abs(update);
            if(!map.containsKey(book)) {
                map.put(book, new int[]{book, 1});
                pq.offer(map.get(book));
            }else{
                if(update < 0) {
                    map.get(book)[1]--;

                }else{
                    map.get(book)[1]++;
                }


            }

            ans[idx++] =  pq.peek()[1];

        }

        return ans;
    }

}
