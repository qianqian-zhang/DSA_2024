public class getScoreDiff {
    //jp morgan oa
//    Given the initial setup of a match between two players, evaluate the match's outcome.
//
//    There are two players, and there is a number sequence of size n.
//
//    Players alternate turns for n rounds.
//
//    Each round, a player removes the first number from the sequence and adds its value to their score.
//
//    After that, if the 'removed" number is even, the remaining sequence is reversed.
//
//    Determine the difference in scores between the two players after the game.
//
//    More precisely, suppose first score and second_score are the final scores of the first and second player, respectively. The goal is to calculate the value of first score - second_score.

    //[1,3,2,5,4]
    //player1, player2
    //round 1: player1(1) [3,2,5,4]
    //round2: player2(3) [2,5,4]
    //round3: player1(3) [4,5]
    //round4: player2(7) [5]
    //round5: player1(8)[]

    //diff = 8 - 7 = 1

    public static int solution(int n, int[] seq) {
        int player1 = 0;
        int player2 = 0;

        int left = 0;
        int right = seq.length - 1;

        boolean leftToRight = true;
        int turn = 0;

        while(left <= right) {
            int num;

            if(leftToRight) {
                num = seq[left];
                left++;
            }else{
                num = seq[right];
                right--;
            }

            if(turn % 2 == 1) {
                player2 += num;
            }else{
                player1 += num;
            }

            //System.out.println("player1: " + player1 + " player2: " + player2);

            if(num % 2 == 0) {
                leftToRight = !leftToRight;
            }

            turn++;
        }

        return player1 - player2;
    }

}


//all odd numbers
//player1 gets numbers at even indices
//player2 gets numbers at odd indices
//if current number is even, add it and reverse i + 1 onwards
//[3,5,7,1,10,13,12,4,3]