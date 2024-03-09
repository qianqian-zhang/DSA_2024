package SmallestPalindrome;

public class SmallestPalindrome {
    public String smallestPalindrome(String s) {
        //given a string s with ?
        //? can denote any lower english letters
        //return the lexicographically smallest palindrome
        //if not, return -1

        //a ? r t ? ? ?
        //fill out the fixed pos
        //a ? r t r ? a
        //smallest letter
        //a a r t r a a

        char[] arr = s.toCharArray();

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while(left < right) {
            char l = arr[left];
            char r = arr[right];

            if(l == '?' && r == '?') { //both are ?
                arr[left] = 'a';
                arr[right] = 'a';
            }else if(l != '?' && r != '?') { //both are letters
                if(l != r) return "-1";
            }else if(l == '?') {  //one is ?
                arr[left] = r;
            }else{
                arr[right] = l;
            }

            left++;
            right--;
        }

        return String.valueOf(arr);

    }

    public String smallestLexicoRearrange(String s) {
        int[] freq = new int[26];

        int n = s.length();
        int wildcard = 0;
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c == '?') {
                wildcard++;
            }else{
                freq[c - 'a']++;
            }
        }

        //check if it can form a palindrome
        //count singled out chars
        int single = 0;
        for(int f : freq) {
            if(f % 2 == 1) single++;
        }
        if(single - wildcard > 1) return "-1";

        //pair all the singled out chars with wildcard
        boolean hasSingle = false;
        char last_single = 'a';
        for(int i = 0; i < 26; i++) {
            if(freq[i] % 2 == 1 && wildcard > 0) {
                freq[i]++;
                wildcard--;

                char c = (char) (i + 'a');
                last_single = c;
                hasSingle = true;
            }
        }

        if(hasSingle && wildcard % 2 == 1) {
            freq[last_single - 'a']--;
            wildcard++;
        }else{
            hasSingle = false;
        }
        freq[0] += wildcard;

        //given a set of letters, form the smallest palindrome (answer is guaranteed

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                char c = (char)(i + 'a');
                for(int j = 0; j < freq[i] / 2; j++) {
                    sb.append(c);
                }
            }
        }

        String firstHalf = sb.toString();
        if(hasSingle) firstHalf += last_single;
        String secondHalf = sb.reverse().toString();

        return firstHalf + secondHalf;
    }
}
