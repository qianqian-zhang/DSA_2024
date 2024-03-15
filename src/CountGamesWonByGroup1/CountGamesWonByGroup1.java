package CountGamesWonByGroup1;

public class CountGamesWonByGroup1 {
    //bruteforce NOT optimal

    public int countGamesWonByGroup1(int n, int[] group1, int[] group2) {
        // write your code here
        //pick two indices i, j

        //bruteforce

        int ans = 0;
        int MOD = 1000000007;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int score1 = group1[i] + group1[j];
                int score2 = group2[i] + group2[j];


                if(score1 > score2) ans++;
                ans %= MOD;
            }
        }

        return ans;

    }

}
