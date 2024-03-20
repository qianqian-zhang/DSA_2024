package AmazonOA.ErasePairs;
import java.util.*;
public class ErasePairs {

    public String erasePairs(String s) {
        //SAME QUESTION 1081. Smallest Subsequence of Distinct Characters
        //if s consists of only Uppercase letters
        int[] freq = new int[26];

        int n = s.length();

        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);

            freq[c - 'A']++;
        }

        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                char c = (char)(i + 'A');

                if(freq[i] % 2 == 1) {
                    set.add(c);
                }
            }
        }

        if(set.isEmpty()) return "";

        //keep in relative order
        //given distinct chars
        //find smallest sequence made of these chars from a string

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Integer> map = new HashMap<>();
        //find last index of each cahr
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if(set.contains(c)){
                map.put(c, i);
            }
        }

        //monotonic stack?
        //"BAXAXA"  ABX
        //BAX
        boolean[] visited = new boolean[26];
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(!set.contains(c)) continue;
            if(visited[c - 'A']) continue;

            while(!stack.isEmpty() && c < stack.peek() && map.get(stack.peek()) > i) {
                visited[stack.pop() - 'A'] = false;
            }

            stack.push(c);
            visited[c - 'A'] = true;
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

}
