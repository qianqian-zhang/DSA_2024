package SmallestPalindrome;

public class Main {
    public static void main(String[] args) {
        SmallestPalindrome solution = new SmallestPalindrome();

       System.out.println(solution.smallestPalindrome("a?rt???"));
       System.out.println(solution.smallestPalindrome("bx??tm"));
       System.out.println(solution.smallestPalindrome("ai?a??u"));
        System.out.println(".......");
        String a = "a?rt???";
        String b = "bx??tm";
        String c = "ai?a??u";
        String d = "ai?a??ua";

        System.out.println(a + " - " + solution.smallestLexicoRearrange(a));
        System.out.println(b + " - " + solution.smallestLexicoRearrange(b));
        System.out.println(c + " - " + solution.smallestLexicoRearrange(c));
        System.out.println(d + " - " + solution.smallestLexicoRearrange(d));
    }
}

//aartraa
//-1
//aaiuiaa a

//? iu aaa iu