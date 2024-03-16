package AmazonOA.GetAverageStanding;

public class Main {
    public static void main(String[] args) {
        GetAverageStanding solution = new GetAverageStanding();

        int d = 3;
        int[][] records = {{1,1,100}, {1,2,200}, {2,1,500}};

        int[][] ans = solution.getAverageStanding(d, records);

        for(int[] a : ans) {
            System.out.println("[" + a[0] + ", " + a[1] + "]" + ", ");
        }
    }
}

//Input:  d = 3, records = [[1, 1, 100], [1, 2, 200], [2, 1, 500]]
//        Output: [[-1, -1], [1, 1], [2, 1]]
//        Explanation:
//
//
//        There are a total of d = 3 players.
//        - Player 0 did not compete in any race, so p0 = -1 and q0 = -1.
//
//        - Player 1 competed in 2 races and came first in both. Their average standing is (1+1)/2. Reduce as described so p1 = 1 and q1 = 1.
//
//        - Player 2 competed in 1 race and came second. Their average standing is (2)/1. Thus, p2 = 2 and q2 = 1.