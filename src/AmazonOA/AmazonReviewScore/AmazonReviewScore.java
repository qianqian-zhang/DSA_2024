package AmazonOA.AmazonReviewScore;
import java.util.*;
public class AmazonReviewScore {


    public int amazonReviewScore(String review, String[] prohibitedWords) {
        //interval
        //tc: o(m * n) + o(mlogm)
        //sc: o(n)
        review = review.toLowerCase();

        List<int[]> list = new ArrayList<>();
        int n  = review.length();

        //o(mn)
        for(String word : prohibitedWords) { //o(m)
            int len = word.length();
            String word_lower = word.toLowerCase();
            for(int i  = 0; i < n; i++) { //o(n)
                if(review.charAt(i) == word_lower.charAt(0)) {
                    //end - i + 1 = len
                    int end = len + i - 1;
                    String reviewWord = review.substring(i, i + len);
                    if(end < n && word_lower.equals(reviewWord)) {
                        list.add(new int[]{i, end});
                    }
                }
            }
        }
        if(list.size() == 0) return n;
        //sort intervals by end time in ascending order
        //o(mlogm)
        Collections.sort(list, (a, b) -> a[1] - b[1]);
//        System.out.println("sorting by end time");
//        for(int[] a:  list) {
//            System.out.print("[" + a[0] + ", " + a[1] + "], ");
//        }

        int m = list.size();
        int max = 0;
        for(int i = 1; i < m; i++) { //o(m)
            int[] prev = list.get(i - 1);
            int[] cur = list.get(i);
            int startTime = Math.min(prev[0], cur[0]);
            int len = cur[1] - 1 - (startTime + 1) + 1;

            max = Math.max(max, len);


        }

        //sort by start time
        Collections.sort(list, (a, b) -> a[0] - b[0]);
//        System.out.println("sorting by start time");
//        for(int[] a:  list) {
//            System.out.print("[" + a[0] + ", " + a[1] + "], ");
//        }
        //first and last intervals
        int[] first = list.get(0);
        max = Math.max(max, first[1]);
        int[] last = list.get(m - 1);
        //last[0] + 1, n - 1
        max = Math.max(max, n - 1 - last[0]);

        return max;


    }


//Go[odPro]ductButS[crap]AfterWash
//dProductButScra

//Go[odPro]ductButS[crap]AfterWash
//dProductButScra
}
