package FindFirstUnique;

public class FindFirstUnique {

    public int findFirstUnique(String s) {
        //given a string
        //return index of first unique char
        //1 based

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            freq[c - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(freq[c - 'a'] == 1) {
                return i + 1;
            }
        }

        return -1;
    }

}
