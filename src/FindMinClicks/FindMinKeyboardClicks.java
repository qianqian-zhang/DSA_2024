package FindMinClicks;

import java.util.Arrays;

public class FindMinKeyboardClicks {

    public int findMinimumKeypadClickCount(String letters) {
        // write your code here

        //9 buttons
        //8 buttons have 3 letters, 1 has 2

        //get char freuncy of letters
        int[] freq = new int[26];
        int n = letters.length();
        for(int i = 0; i < n; i++) {
            char c = letters.charAt(i);

            freq[c - 'a']++;
        }

        //sort
        Arrays.sort(freq);

        int press = 1;

        int count = 0;
        int pos = 0;

        for(int i = 25; i >= 0; i--) {
            if(freq[i] == 0) break;

            if(pos == 9) {
                pos = 0;
                press++;
            }

            count += press * freq[i];
            pos++;

        }

        return count;
    }
    }

