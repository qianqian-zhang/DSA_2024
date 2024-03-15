package GetMinCostData;

public class Main {


    public static void main(String[] args) {
        GetMinCostData solution = new GetMinCostData();
        System.out.println(solution.getMinCostData( "aaaa?aaaa"));
        System.out.println(solution.getMinCostData("??????"));
        System.out.println(solution.getMinCostData("abcd?"));

        System.out.println(solution.getMinCostData("???????a"));//bcdefgha

        System.out.println(solution.getMinCostData("?a?a?b?")); //cadaebf

    }
}
