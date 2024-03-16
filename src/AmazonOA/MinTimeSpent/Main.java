package AmazonOA.MinTimeSpent;

import AmazonOA.CountMaxNumTeams.CountMaxNumTeams;

public class Main {
    public static void main(String[] args) {
        CountMaxNumTeams solution = new CountMaxNumTeams();

        int[] sill = {3,4,3, 1, 6, 5};
        int teamSize = 3;
        int maxDiff = 2;

        System.out.println(solution.countMaxNumTeams(sill, teamSize, maxDiff));

    }
}
//Input:  skill = [3, 4, 1, 6, 5], teamSize = 3, maxDiff = 2
//Output: 2