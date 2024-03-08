package MaxTimesWordRemoved;

public class maxTimeWordRemoved {

    public int maximumTimesWordRemoved(String s, String t) {
        // write your code here

        //char hashing??
        int[] freq = new int[26];

        //get freq of target word
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            freq[c - 'a']++;
        }

        //get frequncy of s
        int[] freq_s = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            freq_s[c - 'a']++;
        }


        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            int freq_t = freq[c - 'a'];

            ans = Math.min(freq_s[c - 'a'] / freq_t, ans);

        }

        return ans;
    }

}
