package RemoveAnagram;
import java.util.*;
public class RemoveAnagram {

    public String[] removeAnagram(String[] textList) {
        // write your code here

        //given a string array,
        //remove all anagrams
        //return rest of strings sorted

        //group all anagrams, but keep the first occurrance of the string
        //for groups > 1, remove them from textList
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : textList) {
            String sig = getSig(str);

            if(!map.containsKey(sig)) {
                map.put(sig, new ArrayList<>());

            }

            map.get(sig).add(str);

        }

        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        for(String str : map.keySet()) {
           list.add(map.get(str).get(0));
        }

        Collections.sort(list);

        int m = list.size();

        if(m == 0) return null;

        String[] arr = new String[m];

        for(int i = 0; i < m; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    public String getSig(String s) {
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
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
