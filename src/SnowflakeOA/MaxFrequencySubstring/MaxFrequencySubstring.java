package SnowflakeOA.MaxFrequencySubstring;

import java.util.HashMap;
//1824 · Most Frequent Substring
//https://www.lintcode.com/problem/1824/
public class MaxFrequencySubstring {

        /**
         * @param s: string s
         * @param minLength: min length for the substring
         * @param maxLength: max length for the substring
         * @param maxUnique: max unique letter allowed in the substring
         * @return: the max occurrences of substring
         */

        //key observation
        //get max freq of subtring meets condition
            //1. length [min, max]
            //2. with at most maxUnique chars
        //******just find substrings of min length********
        //M这个输入是没用的，因为如果一个长度更长的子串出现了k次，那么长度是m的子串必然能出现不少于k次。
        //find max frquency of subtring of size minLength, with at most maxUnique chars
        //FIXED size sliding window pattern
        public int getMaxOccurrences(String s, int minLength, int maxLength, int maxUnique) {
            // write your code here
            int[] freq = new int[26];
            int n = s.length();
            HashMap<String, Integer> map = new HashMap<>();
            int unique = 0;
            int ans = 0;
            //add first min - 1 chars
            for(int i = 0; i < minLength - 1; i++) {
                if(freq[s.charAt(i) - 'a'] == 0) {
                    unique++;
                }

                freq[s.charAt(i) - 'a']++;
            }

            int left = 0;
            int right = minLength - 1;

            while(right < n) {
                //add right char
                if(freq[s.charAt(right) - 'a'] == 0) {
                    unique++;
                }
                freq[s.charAt(right) - 'a']++;

                //len == minLength, check unuque
                if(unique <= maxUnique) {
                    String temp = s.substring(left, right + 1);
                    map.put(temp, map.getOrDefault(temp, 0) + 1);
                    ans = Math.max(ans, map.get(temp));
                }

                //shrink window
                freq[s.charAt(left) - 'a']--;
                if(freq[s.charAt(left) - 'a'] == 0) unique--;
                left++;

                right++;
            }

            return ans;
        }


//abccabc 2-4
}
