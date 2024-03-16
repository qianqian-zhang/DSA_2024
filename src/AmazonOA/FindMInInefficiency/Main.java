package AmazonOA.FindMInInefficiency;

public class Main {
    public static void main(String[] args) {
        FindMinInefficiency solution = new FindMinInefficiency();

        System.out.println(solution.findMinimumInefficiency("??011??0"));//2
        System.out.println(solution.findMinimumInefficiency( "00?10??1?"));//3
    }
}
//
//Input:  serverType = "??011??0"
//        Output: 2

//        Input:  serverType = "00?10??1?"
//        Output: 3
//        Explanation:
