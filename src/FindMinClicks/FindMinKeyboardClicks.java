package FindMinClicks;

import java.util.Arrays;

public class FindMinKeyboardClicks {
//    1   2   3
//    abc def ghi
//    4   5   6
//    jkl mno pqr
//    7   8   9
//    stu vwx yz

    //given a String letters, design a keyboard to minimize the number of clicks a user needs to type out these letters
    //you can rearrange letters for each button on the keypad
    //for example, when you want to type b, you have to click button 1 twice, type 0, click button 3 times

    public int findMinimumKeypadClickCount(String letters) {
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

