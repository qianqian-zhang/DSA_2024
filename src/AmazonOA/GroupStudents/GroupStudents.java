package AmazonOA.GroupStudents;

import java.util.Arrays;

public class GroupStudents {

    public int groupStudents(int[] levels, int maxSpread) {
        //given an array
        //find mimimum subsets, where range <= maxSpread

        Arrays.sort(levels);
        //1,3,4,4,7

        int count = 1;

        int min = levels[0];

        for(int i = 1; i < levels.length; i++) {
            if(levels[i] - min > maxSpread) {
                count++;
                min = levels[i];
            }
        }

        return count;

    }

}

