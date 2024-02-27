package StringMatchingLibrary;

public class Main {
    public static void main(String[] args) {
        String[] text ={"code", "coder", "aabcde"};
        String[] pat = {"co*d", "co*er", "aa*"};

        StringMatchingLib solution = new StringMatchingLib();

        String[] res = solution.stringMatching(text, pat);

        for(String res_ : res) {
            System.out.println(res_);
        }
    }
}
