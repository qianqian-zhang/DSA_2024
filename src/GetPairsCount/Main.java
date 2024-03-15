package GetPairsCount;

public class Main {
    public static void main(String[] args) {
        GetPairsCount solution = new GetPairsCount();

        System.out.println(solution.getPairsCount(new int[]{100, 200, 300, 400}, 250));
        System.out.println(solution.getPairsCount(new int[]{10, 12, 11}, 0));
        System.out.println("**********");
        System.out.println(solution.getPairsCountHashing(new int[]{100, 200, 300, 400}, 250));
        System.out.println(solution.getPairsCountHashing(new int[]{10, 12, 11}, 0));
    }
}
