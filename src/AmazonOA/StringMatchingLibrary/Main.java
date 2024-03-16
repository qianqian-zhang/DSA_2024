package AmazonOA.StringMatchingLibrary;

public class Main {
    public static void main(String[] args) {
        String[] text ={"code", "coder", "aabcde"};
        String[] pat = {"co*d", "co*er", "aa*"};

        StringMatchingLib solution = new StringMatchingLib();

        String[] res = solution.stringMatching(text, pat);

        for(String res_ : res) {
            System.out.println(res_);
        }
        System.out.println("*************second try");
        StringMatchingLibrary solution2 = new StringMatchingLibrary();
        String[] res2 = solution2.matchStrings(text, pat);

        for(String res_ : res2) {
            System.out.println(res_);
        }
        System.out.println("******");
        String[] t = {"hackerrank", "hackerrank"};
        String[] p = {"hac*rank", "hac*rnak"};

        String[] a = solution2.matchStrings(t, p);
        for(String ans : a) {
            System.out.println(ans);
        }
    }
}