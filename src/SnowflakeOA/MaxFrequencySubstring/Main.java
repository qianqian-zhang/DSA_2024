package SnowflakeOA.MaxFrequencySubstring;

public class Main {
    public static void main(String[] args) {
        MaxFrequencySubstring solution = new MaxFrequencySubstring();
        //abccab 2,3,2
        System.out.println(solution.getMaxOccurrences("abccab", 2, 3, 2)); //2
        System.out.println(solution.getMaxOccurrences("aaaa", 1, 3, 2)); //4
    }
}
//
//    Max Frequency Substring
//        Given a string containing a number of characters, find the substrings within the string that satisfy the conditions below:
//
//        The substring's length should be in the inclusive interval (minLength, maxLength).
//        The total number of unique characters should not exceed maxUnique.
//        Using those conditions, determine the frequency of the maximum occurring substring.
//
//        Function Description
//
//        Complete the function getMaxFrequencySubstring in the editor.
//
//        getMaxFrequencySubstring has the following parameters:
//
//        String s: the string to analyze
//        int minLength: the minimum length of the substring
//        int maxLength: the maximum length of the substring
//        int maxUnique: the maximum number of unique characters in the substring
//        Returns
//
//        int: the frequency of the maximum occurring substring
//
