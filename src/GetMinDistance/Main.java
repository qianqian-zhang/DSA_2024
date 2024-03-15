package GetMinDistance;

public class Main {
    public static void main(String[] args) {
        GetMinDistance solution = new GetMinDistance();

        int[]center = {1, 2, 2}, destination = {5, 2, 4};
        System.out.println(solution.getMinDistance(center, destination));


        int[]center2 = {3, 1, 6, 8, 9}, destination2 = {2, 3, 1, 7, 9};
        System.out.println(solution.getMinDistance(center2, destination2));

    }
}

