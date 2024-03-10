package MakePowerNondescending;

public class MakePowerNondesc {

    public int makePowerNonDescreasing(int[] power) {
        // write your code here

        //finding peak mountain

        int n = power.length;
        int ans = 0;

        for(int i = 1; i < n; i++) {
            int diff = power[i] - power[i - 1];

            if(diff < 0) ans += -diff;
        }

        return ans;



    }
//3, 4, 1, 6, 2
//3, 4, 4, 9, 5
//3, 4, 4, 9, 9

//7
}
