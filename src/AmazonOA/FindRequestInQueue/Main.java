package AmazonOA.FindRequestInQueue;

public class Main {
    public static void main(String[] args) {
        FindRequestInQueue solution = new FindRequestInQueue();

        int[] ans = solution.findRequestsInQueue(new int[]{2, 2, 3, 1});
        for(int n : ans) System.out.println(n);

    }
}
