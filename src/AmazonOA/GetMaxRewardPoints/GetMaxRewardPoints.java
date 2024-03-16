package AmazonOA.GetMaxRewardPoints;

import java.util.Arrays;

public class GetMaxRewardPoints {

    public long getMaxRewardPoints(int[] reward) {
        // write your code here
        //greedy / math
        //every turn, pick highest score
        int n = reward.length;
        Arrays.sort(reward);
        int deduct = 0;
        long score = 0l;
        for(int i = n - 1; i >= 0; i--) {

            reward[i] -= deduct;
            if(reward[i] > 0) score += reward[i];

            deduct++;


        }

        return score;
    }

//5, 2, 2, 3, 1
//0,1,1,2,0  ans = 5
//0,0,0,0,0 ans = 7

//5 ,5 ,5
//0,4,4 ans = 5
//0,0,3 ans = 9
//ans = 12
}
