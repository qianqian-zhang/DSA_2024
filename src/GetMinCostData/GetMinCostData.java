package GetMinCostData;

import java.util.PriorityQueue;

public class GetMinCostData {

    public String getMinCostData(String data) {
        // write your code here
        //freq - 1 = cost

        //get freq of each char
        int[] freq = new int[26];
        int wildcard = 0;
        for(int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == '?') {
                wildcard++;
            }else{
                freq[data.charAt(i) - 'a']++;
            }

        }

        //sort by frequncy
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if(a[1] == b[1]) {
                return a[0] - b[0];
            }else{
                return a[1] - b[1];
            }
        });

        for(int i = 0; i < 26; i++) {
            pq.offer(new int[]{i, freq[i]});
        }

        StringBuilder sb = new StringBuilder();

        while(wildcard > 0) {
            int[] node = pq.poll();
            char c = (char)(node[0] + 'a');
            node[1]++;
            sb.append(c);
            pq.offer(node);
            wildcard--;
        }



        char[] arr = data.toCharArray();

        int idx = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '?') {
                arr[i] = sb.charAt(idx++);
            }
        }

        return String.valueOf(arr);
    }

}
