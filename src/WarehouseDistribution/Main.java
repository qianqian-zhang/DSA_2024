package WarehouseDistribution;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 5, 8, 7};
        int[] arr1 = {2, 4 ,1};
        int[] arr2 = {3, 8, 1, 5};
        int[] arr3 = {2, 3, 5, 7};

        WarehouseDistribution solution = new WarehouseDistribution();

        System.out.println(solution.warehouseDis(arr));
        System.out.println(solution.warehouseDis(arr1));
        System.out.println(solution.warehouseDis(arr2));
        System.out.println(solution.warehouseDis(arr3));
    }
}

//3, 8, 1, 5

//3, 7, 2, 5
//3, 6, 3, 5
//3, 5, 4, 5
//4, 4, 4, 5

//2, 3, 5, 7

//3, 3, 5, 6
//3, 4, 5, 5
//4, 4, 5, 4