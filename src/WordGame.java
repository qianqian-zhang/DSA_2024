import java.util.HashMap;

public class WordGame {
    public static void main(String[] args) {
        System.out.println(wordGame("aabbbc", "abbd"));
    }

    private static int wordGame(String word1, String word2) {
        //return number of common letters
        //aabbc  abbd 3

        HashMap<Character, Integer> map = new HashMap<>();
        int len1 = word1.length();
        int len2 = word2.length();
        int count = 0;

        for(int i = 0; i < len1; i++) {
            char c = Character.toLowerCase(word1.charAt(i));

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < len2; i++) {
            char c = Character.toLowerCase(word2.charAt(i));

            if(!map.containsKey(c)) continue;

            count++;

            map.put(c, map.get(c) - 1);
            if(map.get(c) == 0) map.remove(c);
        }

        return count;
    }
}
