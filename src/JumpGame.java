public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        //positioned at first index. arr[i] denotes jump range
        //return true if able to reach last index
    }

    public static boolean jumpGame(int[] arr) {
        //base case
        int n = arr.length;
        if(n == 1) return true;
        int maxReach = arr[0];

        for(int i = 0; i < n; i++) {
            if(maxReach >= n - 1) return true;

            maxReach = Math.max(maxReach, arr[i] + i);
        }
        return false;
    }
}
