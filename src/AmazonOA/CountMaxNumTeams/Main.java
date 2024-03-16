package AmazonOA.CountMaxNumTeams;

public class Main {
    public static void main(String[] args) {
        CountMaxNumTeams solution = new CountMaxNumTeams();
        System.out.println(solution.countMaxNumTeams(new int[]{3, 4, 3, 1, 6, 5}, 3, 2));
}
}
//Input:  skill = [3, 4, 1, 6, 5], teamSize = 3, maxDiff = 2
//        Output: 2
//        Explanation:
//
//        At most, 2 teams can be formed: [3, 3, 1] and [4, 6, 5].The difference between the maximum and minimum skill levels is 2 in each case, which does not exceed the threshold value of 2