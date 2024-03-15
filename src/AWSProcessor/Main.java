package AWSProcessor;

public class Main {
    public static void main(String[] args) {
        AWSProcessor solution = new AWSProcessor();

        System.out.println(solution.totalExecutionTime(new int[]{5, 5, 3, 6, 5, 3}));
    }
}
