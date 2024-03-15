package AWSProcessor;

public class AWSProcessor {

    public int totalExecutionTime(int[] execution) {
        // write your code here
        int n = execution.length;
        int[] copy = new int[n];

        for(int i = 0; i < n; i++) {
            copy[i] = execution[i];
        }

        int ans = 0;

        for(int i = 0; i < n; i++) {
            ans += execution[i];
            int original = copy[i];

            for(int j = i + 1; j < n; j++) {
                if(copy[j] == original) {
                    //cohesive element, cut in half (ceil)
                    if(execution[j] % 2 == 0) {
                        execution[j] /= 2;
                    }else{
                        execution[j] /= 2;
                        execution[j]++;
                    }
                }
            }

            System.out.println(i + 1 + " execution, " + ans);
        }

        return ans;
    }

}
