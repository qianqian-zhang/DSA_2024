package AmazonOA.FindMaxSubjectPassed;

import java.util.Arrays;

public class FindMaxSubjectPassed {

    public int findMaximumNum(int[] answered, int[] needed, int q) {
        //there are n subjects
        //answered[i] is the number of questions answered by the student
        //needed[i] is the number of questions you need to answer to pass the subject
        //q is number of additional questions you can answer, free to distribute on these subjects
        //return max amoubt of subjects you can pass

        //calculate for each subject, how many questions needed to pass
        int n = answered.length;

        for(int i = 0; i < n; i++) {
            int diff = needed[i] - answered[i];

            if(diff <= 0) {
                //pass
                needed[i] = 0;
            }else{
                needed[i] = diff;
            }
        }

        Arrays.sort(needed);
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(needed[i] == 0) {
                count++;
            }else{
                if(q < needed[i]) break;
                count++;
                q -= needed[i];
            }
        }

        return count;
    }

}
