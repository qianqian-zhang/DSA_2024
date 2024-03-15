package AmazonOA.SmallestPalindrome;

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

    public String getSmallestPalindrome(String s) {
        // given a string with ? as wildcard that be replaced by any letter
        //we can return the lexicographically smallest string
        //if not, return -1


        //determine if we can form a palindromic string
        //without wildcard, string of letters
        //count how many chars that are singled out
        //get freqncy of each letter, if it is and odd number, one char will be singled out
        //WITH wilcard, we can pair the sigled out chars with wildcard
        //number of singledout - wildcard > 1, can NOT form a pallindrome
        int n = s.length();
        int[] freq = new int[26];
        int wildcard = 0;
        int single = 0;
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if(c == '?') {
                wildcard++;
            }else{
                freq[c - 'a']++;
            }
        }

        for(int i = 0; i < 26; i++) {
            if(freq[i] % 2 == 1) {
                single++;

            }
        }

        if(single - wildcard > 1) return "-1";


        //put the smallest chars in the front of the string, larger chars in center
        //use ? to pair with singled out chars
        //after pairing all singles, if there is an odd number of wildcard chars left, undo last pairing
        //recover last largest singledout char, now we can an even number of wildcard chars
        //*****put largest singled out char in middle*****
        //otherwise, dont recover, replace rest of wildcard chars with 'a'
        boolean hasSingle = false;
        //abc ??  ab c ba
        char last_single = 'a';
        for(int i = 0; i < 26; i++) {
            if(freq[i] % 2 == 1) {
                if(wildcard > 0) {
                    //current char no longer singled out
                    wildcard--;
                    freq[i]++;
                }else{
                    //run out of wildcard, so singled out
                    hasSingle = true;
                }

                char c = (char)(i + 'a');
                last_single = c;

            }
        }
        //abc **** --> aabbcc * recover c
        if(wildcard % 2 == 1) {
            //recover last single
            freq[last_single - 'a']--;
            wildcard++;
            hasSingle = true;
        }

        //replace rest of wildcard with 'a'
        freq[0] += wildcard;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                int frequency = freq[i];
                char c = (char)(i + 'a');

                //append half of it
                for(int j = 0; j < frequency / 2; j++) {
                    sb.append(c);
                }
            }
        }

        if(freq[0] % 2 == 1) {
            hasSingle = true;
            last_single = 'a';
        }
        String firstHalf = sb.toString();
        //get second half of palindrome
        String secondHalf = sb.reverse().toString();

        //check if theres a single char
        if(hasSingle) {
            firstHalf += last_single;
        }

        return firstHalf + secondHalf;
    }


    //"ai?a??u"
    //aa i u ???
    //pair all: iiuu ?
    //a i u i a  ??
    //aa i u i aa
}
