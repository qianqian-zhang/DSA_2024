package MaxNumOfShipments;

public class Main {
    public static void main(String[] args) {
        MaxNumOfShipments solution = new MaxNumOfShipments();
        System.out.println(solution.maxNumberOfBalancedShipments(new int[]{1, 2, 3, 2, 6, 3}));
        System.out.println(solution.maxNumberOfBalancedShipments(new int[]{8, 5, 4, 7, 2}));
        System.out.println(solution.maxNumberOfBalancedShipments(new int[]{4, 3, 6, 4, 5, 3, 4, 7, 1, 7, 7}));
    }
}
//4, 3    , 6, 4     , 5, 3     , 4, 7, 1,   7,7