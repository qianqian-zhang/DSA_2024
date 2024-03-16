package AmazonOA.CountSpikes;

public class CountSpikes {

    public int countSpikes(int[] prices, int k) {
        // write your code here
        //prefix sum prefix[i] denotes number of indices meet condition before i
        //suffix sum suffix[i] denotes number of indices meet condition after i
        int n = prices.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        //o(n * n)

        for(int i = 0; i < n; i++) {
            int num = prices[i];

            for(int j = 0; j < n; j++) {
                if(j < i && prices[j] < num) {
                    prefix[i]++;
                }
                if(j > i && prices[j] < num) {
                    suffix[i]++;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++) {
            if(prefix[i] >= k && suffix[i] >= k) count++;
        }

        return count;

    }

}
