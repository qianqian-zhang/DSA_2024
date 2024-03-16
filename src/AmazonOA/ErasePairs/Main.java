package AmazonOA.ErasePairs;

public class Main {
    public static void main(String[] args) {
        ErasePairs solution = new ErasePairs();
        System.out.println(solution.erasePairs("CBCAAXA"));
        System.out.println(solution.erasePairs("ZYXZYZY"));
        System.out.println(solution.erasePairs("ABCBACDDAA"));
    }
}

//        Input:  S = "CBCAAXA"
//        Output: "BAX"
//
//
//        Input:  S = "ZYXZYZY"
//        Output: "XYZ"
//
//        Input:  S = "ABCBACDDAA"
//        Output: " "
//        Explanation:
//