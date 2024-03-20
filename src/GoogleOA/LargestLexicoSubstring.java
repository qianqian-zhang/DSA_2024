package GoogleOA;
import java.util.*;
public class LargestLexicoSubstring {

    public String getLargestLexicographicalSubstring(String A, String B) {
        //find out if such subarray is possible
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < A.length(); i++) {
            set.add(A.charAt(i));
        }
        HashSet<Character> set2 = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < B.length(); i++) {
            set2.add(B.charAt(i));
            map.put(B.charAt(i), i);
        }
        for(char c : set) {
            if(!set2.contains(c)) return "-1";
        }

        //find start index of largest sequence that contains all unique chars from a
        //return b.substring(start);
        Stack<Character> stack = new Stack<>();
        boolean[] visited = new boolean[26];
        for(int i = 0; i < B.length(); i++) {
            char c = B.charAt(i);
            if(visited[c - 'a']) continue;

            while(!stack.isEmpty() && stack.peek() < c &&  map.get(stack.peek()) > i) {
                visited[stack.pop() - 'a'] = false;

            }

            stack.push(c);
            visited[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        String seq = sb.reverse().toString();
//        System.out.println("seq: " + seq);
        //find start of this sequence
        char first = seq.charAt(0);
        int count = 0;
        for(int i = 0; i < seq.length(); i++) {
            if(seq.charAt(i) == first) count++;
        }
        int idx = B.length() - 1;
        while(count > 0) {
            if(B.charAt(idx) == first) count--;

            idx--;
        }

        while(idx > 0 && B.charAt(idx) == first) {
            idx--;
        }

        return B.substring(idx + 1);
    }

//abcab[cbaaaa]
}
