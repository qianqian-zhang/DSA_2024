package CountGamesWonByGroup1;

public class Main {
    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        int[] a2 = {3,2,1};

        CountGamesWonByGroup1 solution = new CountGamesWonByGroup1();

        System.out.println(solution.countGamesWonByGroup1(3, a1, a2)); //1
    }
}
