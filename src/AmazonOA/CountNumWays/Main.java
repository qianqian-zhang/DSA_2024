package AmazonOA.CountNumWays;

import AmazonOA.CountMaxNumTeams.CountMaxNumTeams;

public class Main {
    public static void main(String[] args) {
        CountNumWays solution = new CountNumWays();

        System.out.println(solution.countNumWays("amazon", 3));//1
        System.out.println(solution.countNumWays("ababa", 2));//2
    }
}
//Input:  s = "amazon", k = 3
//        Output: 1
//        Explanation:
//        Consider all substrings of length k = 3. There are the possible ways to perform the given operation are showing in the above img:
//        Example 2:
//
//        Input:  s = "ababa", k = 2
//        Output: 2
//        Explanation:
//
//
//        There are the possible ways for k = 2:
//
//        (1) ababa --> baaba: unsuccessful, lexicographically greater thanthe original string.
//        (2) ababa --> aabba: successfully, lexicographically smaller than the original string.
//        (3) ababa --> abbaa: unsuccessfully, lexicographically greater.
//        (4) ababa --> abaab: successfully, lexicographically smaller.
//
