package FindRecurringNames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FindRecurringNames {

    public String[] findRecurringNames(String[] realNames, String[] allNames) {
        //find names in realNames, that have MORE THAN 1 anagrams in allNames array
        //return String[] sorted

        HashMap<String, Integer> map = new HashMap<>();
        for(String name : allNames) {
            String sig = getSig(name);

            map.put(sig, map.getOrDefault(sig, 0) + 1);
        }

        List<String> list = new ArrayList<>();
        for(String name : realNames) {
            String sig  = getSig(name);

            if(map.containsKey(sig) && map.get(sig) > 1) list.add(name);
        }


        String[] ans;
        if(list.size() == 0) {
            ans = new String[]{"None"};
        }else{
            Collections.sort(list);
            int n = list.size();
            ans = new String[n];

            for(int i = 0; i < n; i++) {
                ans[i] = list.get(i);
            }
        }

        return ans;

    }

    public String getSig(String s) {
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                char c = (char)(i + 'a');
                sb.append(c);
                sb.append(freq[i]);
            }
        }

        return sb.toString();
    }

}
