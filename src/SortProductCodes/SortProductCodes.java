package SortProductCodes;

import java.util.Arrays;
import java.util.HashMap;

public class SortProductCodes {

    public String[] sortProductCodes(String order, String[] productCodes) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            char alpha = (char)(i + 'a');

            map.put(c, alpha);
            map2.put(alpha, c);
        }
        int n = productCodes.length;
        String[] temp = new String[n];
        int idx = 0;
        for(String s : productCodes) {
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < s.length(); i++) {
                sb.append(map.get(s.charAt(i)));
            }

            temp[idx++] = sb.toString();

        }

        Arrays.sort(temp);

        for(int i = 0; i < n; i++) {
            String str = temp[i];
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < str.length(); j++) {
                sb.append(map2.get(str.charAt(j)));
            }

            temp[i] = sb.toString();
        }

        return temp;
    }

}

