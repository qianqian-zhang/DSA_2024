package SnowflakeOA.MaximumSubstrings;

public class Main {
    public static void main(String[] args) {
        MaximumSubstrings solution = new MaximumSubstrings();
        System.out.println(solution.getMaxBeautifulSubstrings(".a.bb.")); //aabbb 13
        System.out.println(solution.getMaxBeautifulSubstrings("....")); //10
        System.out.println(solution.getMaxBeautifulSubstrings("aabb")); //6
        System.out.println(solution.getMaxBeautifulSubstrings(".aa.bb.")); //aaaabbb
    }
}
//    The people in HackerLand, are getting ready for a parade. There should be no instance where a person is wearing a white-colored uniform. There is a given string color that contains lowercase English characters ('a' - 'z'). Some of the positions in the string are empty, meaning that the color of the uniform is white at that position and is denoted by the '.' character.
//
//        A beautiful string is defined as a string in which all characters are the same. For example "aaa", "zzzzz", "f" are beautiful while "aba", "aaad" are not beautiful. Replace each non-colored uniform with some lowercase English character such that the total number of substrings that are beautiful maximized.
//
//        Find the maximum total number of beautiful substrings after replacing every empty character.
//
//        Note: A substring of a string is a contiguous subsequence of that string.
//
//        Function Description
//
//        Complete the function getMaxBeautifulSubstrings in the editor.
//
//        getMaxBeautifulSubstrings has the following parameter(s):
//
//        string color: the color of each uniform
//        Returns
//
//        int: the maximum number of beautiful substrings possible
//
//        Example 1:
//
//        Input:  color = ".a.bb."
//        Output: 13
//        Explanation:
//
//        The optimal filled string is "aabbbb".
//
//        The beautiful substrings are {"a", "a", "aa", "b", "b", "b", "b", "bb", "bb", "bbb", "bbb",, "bbbb"}. The maximum possible number of beautiful substrings is 13.