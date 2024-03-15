package AmazonOA.FindMaxCount;
import java.util.*;
public class FindMaxCount {

    public int findMaximumMaximumCount(String categories) {
        // write your code here
        int n = categories.length();
        int[] count = new int[n];
        HashMap<Character, int[]> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            char c = categories.charAt(i);

            if(!map.containsKey(c)) {
                map.put(c, new int[n]);
            }

        }

        for(char c : map.keySet()) {
            int[] arr = countFrequency(c, categories);
            map.put(c, arr);

            for (int i = 0; i < n; i++) {
                count[i] = Math.max(count[i], arr[i]);
            }
        }

            int ans = 0;

            for(char c : map.keySet()) {
                int temp = countCharMax(c, count, map.get(c));

                ans = Math.max(ans, temp);
            }

            return ans;


        }



    public int[] countFrequency(char c, String s) {
        int n = s.length();
        int[] freq = new int[n];

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == c) {
                freq[i]++;
            }
        }

        for(int i = 1; i < n; i++) {
            freq[i] += freq[i - 1];
        }

        return freq;
    }

    public int countCharMax(char c, int[] count, int[] freq) {
        int res = 0;

        for(int i = 0;  i < count.length; i++) {
            if(count[i] <= freq[i]) res++;
        }

        return res;
    }

}
