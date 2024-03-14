package SortProductCodes;

public class Main {
    public static void main(String[] args) {
        SortProductCodes solution = new SortProductCodes();

        String order = "abcdefghijklmnopqrstuvwxyz";
        String[] productCodes = {"bc", "ab", "a", "ab", "abc"};

        String[] ans = solution.sortProductCodes(order, productCodes);

        for(String a : ans) System.out.println(a);
    }
}
