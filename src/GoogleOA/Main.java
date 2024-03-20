package GoogleOA;

public class Main {
    public static void main(String[] args) {
        //Input:  A = "abc", B = "abcab"
        //Output: "cab"
        LargestLexicoSubstring solution = new LargestLexicoSubstring();
        System.out.println(solution.getLargestLexicographicalSubstring("abc", "abcab")); //cab
        System.out.println(solution.getLargestLexicographicalSubstring("abc", "abcabca")); //
        System.out.println(solution.getLargestLexicographicalSubstring("abc", "aazaczb"));
        System.out.println(solution.getLargestLexicographicalSubstring("abc", "bbbaca"));
        System.out.println(solution.getLargestLexicographicalSubstring("abc", "bbbccccba"));
    }
}
