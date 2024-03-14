package FindRequestInQueue;

public class FindRequestInQueue {

    public int[] findRequestsInQueue(int[] wait) {
        // write your code here

        int n = wait.length;

        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            //for every second

            int count = 0;

            for(int j = i; j < n; j++) {
                if(wait[j] > i) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }

}
