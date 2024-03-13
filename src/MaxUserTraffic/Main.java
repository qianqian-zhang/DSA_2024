package MaxUserTraffic;

public class Main {
    public static void main(String[] args) {
        MaxUserTraffic solution = new MaxUserTraffic();
        int[] login = {1,2,3};
        int[] logout = {10, 8, 4};
        System.out.println(solution.maximumUserTraffic(login, logout));
    }
}
