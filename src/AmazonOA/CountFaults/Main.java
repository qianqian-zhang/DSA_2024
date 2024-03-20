package AmazonOA.CountFaults;

public class Main {
    public static void main(String[] args) {
        CountFaults solution = new CountFaults();
        System.out.println(solution.countFaults(2, new String[]{"s1 error", "s1 error", "s2 error", "s1 error", "s1 error", "s2 success"}));
    }
}
