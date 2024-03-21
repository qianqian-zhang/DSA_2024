package TwoSigOA.PairsDivisibleByN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PairsDivisibleByN {

    public int sumBeingAbletoBeDivisibleByN(int N, int[] arr) {
        // lc1010
        // given an array
        //return number of pairs whose sum is divisible by N

        //key observation
        //(a + b) % N == 0
        //remainder1 = a % N; raminder2 = b % N
        //1. if remainder1 == 0, remainser2 == 0
        //2. otherwise, remainder1 + remainder2 == N

        //finding number of pairs whose sum is divisable by N
        //the remainders [0, N - 1]
        int[] remainder = new int[N]; //remainder[i] denotes number of elements with remainder i
        int ans = 0;
        for(int t : arr) {
            int remain = t % N;

            if(remain == 0) {
                ans += remainder[0];
            }else{
                ans += remainder[N - remain];
            }

            remainder[remain]++;
        }

        return ans;

    }

}
