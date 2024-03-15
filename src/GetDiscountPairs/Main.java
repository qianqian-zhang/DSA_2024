package GetDiscountPairs;

public class Main {
    public static void main(String[] args) {
        GetDiscountPairs solution = new GetDiscountPairs();

        System.out.println(solution.getDiscountPairs(60, new int[]{31, 25, 85, 29, 35}));

        System.out.println(solution.getDiscountPairs2(60, new int[]{31, 25, 85, 29, 35}));
    }
}
