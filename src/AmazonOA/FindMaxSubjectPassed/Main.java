package AmazonOA.FindMaxSubjectPassed;

public class Main {
    public static void main(String[] args) {
        FindMaxSubjectPassed solution = new FindMaxSubjectPassed();
        int[] a = {24, 27, 0};
        int[] n = {51, 52, 100};
        int q = 100;

        System.out.println(solution.findMaximumNum(a, n, q));
    }



}


//Input:  answered = [24, 27, 0], needed = [51, 52, 100], q = 100
//        Output: 2