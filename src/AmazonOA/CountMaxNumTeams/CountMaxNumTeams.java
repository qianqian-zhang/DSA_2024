package AmazonOA.CountMaxNumTeams;

import java.util.Arrays;

public class CountMaxNumTeams {

    public int countMaxNumTeams(int[] skill, int teamSize, int maxDiff) {
        // write your code here

        int n = skill.length;

        Arrays.sort(skill);
        int count = 0;
        int i = 0;

        while(i < n) {
            //end - i + 1 = teamSiz
            int end = teamSize + i - 1;

            if(end < n) {
                int diff = skill[end] - skill[i];

                if(diff <= maxDiff) {
                    count++;
                    i = end + 1;
                }else{
                    i++;
                }
            }else{
                break;
            }
        }

        return count;
    }


}
