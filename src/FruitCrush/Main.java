package FruitCrush;

public class Main {
    public static void main(String[] args) {
        FruitCrush solution = new FruitCrush();

        int[] arr = {4,4,4,4,2,3,3,1};
        //freq: 4,2,1,1
        //2,1,1
        //1,1
        //0

        int[] arr1 = {4,4,4,4,2,3,3,1,2};
        //4,2,2,1
        //2,2,1
        //1

        int[] arr2 = { 1, 1, 2, 2, 2, 3, 3, 3};

        System.out.println(solution.fruitCrush(arr));
        System.out.println(solution.fruitCrush(arr1));
        System.out.println(solution.fruitCrush(arr2));
    }



}
