package GetTrucksForItems;

public class Main {
    public static void main(String[] args) {
        GetTrucksForItems solution = new GetTrucksForItems();

        int[] trucks = {4, 5, 7, 2};
        int[] items = {1, 2, 5};

        int[] ans = solution.getTrucksForItems(trucks, items);
        for(int a : ans) System.out.println(a); //3,0,2
        System.out.println("****");
        int[] trucks2 = {5, 3, 8, 1};
        int[] items2 = {6, 10};

        int[] ans2 = solution.getTrucksForItems(trucks2, items2);
        for(int a : ans2) System.out.println(a); //3,0,2
        System.out.println("****");

        int[] trucks3 = {1, 3, 5, 2, 3, 2};
        int[] items3 = {1, 2, 3};

        int[] ans3 = solution.getTrucksForItems(trucks3, items3);
        for(int a : ans3) System.out.println(a); //3,0,2
        System.out.println("****");
    }
}
