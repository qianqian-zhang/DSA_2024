package AmazonOA.NumOfSuitableLocations;

public class Main {
    public static void main(String[] args) {
        NumOfSuitableLocations solution = new NumOfSuitableLocations();

        System.out.println(solution.numberOfSuitableLocations(new int[]{-2, 1, 0}, 8));
        System.out.println(solution.numberOfSuitableLocations(new int[]{2, 0, 3, -4}, 22));
        System.out.println(solution.numberOfSuitableLocations(new int[]{-3, 2, 2}, 8));
        System.out.println("*******");
        System.out.println(solution.numberOfSuitableLocations2(new int[]{-2, 1, 0}, 8));
        System.out.println(solution.numberOfSuitableLocations2(new int[]{2, 0, 3, -4}, 22));
        System.out.println(solution.numberOfSuitableLocations2(new int[]{-3, 2, 2}, 8));
        System.out.println("*******");
        System.out.println(solution.numOfSuitableLocationsLinear(new int[]{-2, 1, 0}, 8));
        System.out.println(solution.numOfSuitableLocationsLinear(new int[]{2, 0, 3, -4}, 22));
        System.out.println(solution.numOfSuitableLocationsLinear(new int[]{-3, 2, 2}, 8));
    }
}
