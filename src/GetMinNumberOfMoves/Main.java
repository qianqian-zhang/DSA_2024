package GetMinNumberOfMoves;

public class Main {
    public static void main(String[] args) {
        GetMinNumberOfMoves solution = new GetMinNumberOfMoves();

        System.out.println(solution.getMinNumMoves(new int[]{2, 4, 3, 1, 6}));
        System.out.println(solution.getMinNumMoves(new int[]{4, 11, 9, 10, 12}));
        System.out.println(solution.getMinNumMoves(new int[]{3,2,1}));
    }
}
