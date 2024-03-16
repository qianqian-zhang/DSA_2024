package AmazonOA.GetMinCost;

public class Main {
    public static void main(String[] args) {
        GetMinCost solution = new GetMinCost();

        int[] a = {2,1,1};
        int[] b  = {1,2,3};

        System.out.println(solution.getMinimumCost(a, b, 4));
    }
}
//Input:  a = [2, 1, 1], b = [1, 2, 3], m = 4
//        Output: 7
//        Explanation:
//
//
//        The optimal types to buy are-
//
//        1. Choose i = 1. This is the first purchase of this type of item, so j = 1. The first item costs a[1] + (1 - 1) * b[i] = 1 + (1 - 1) * 2 = 1.
//
//        2. Choose i = 2. Again, it is the first purchase of this type so j = 1. The second item costs 1 + (1 - 1) * 3 = 1.
//
//        3. Choose i = 0 which costs 2 + (1 - 1) * 1 = 2.
//
//        4. When a second unit of any type is purchased, j = 2 for that transaction. The costs of a second units of each item are:
//        a. a[0] costs a[0] + (2 - 1) * b[0] = 2 + 1*1 = 3
//        b. a[1] costs 1 + 1*2 = 3
//        c. a[2] costs 1 + 1*3 = 4
//        d. Choose either a[0] or a[1] since they cost less.
//
//        The total cost to purchase is 1 + 1 + 2 + 3 = 7.
//