package AmazonOA.AmazonReviewScore;

public class Main {
    public static void main(String[] args) {
        AmazonReviewScore solution = new AmazonReviewScore();

        String review = "GoodProductButScrapAfterWash";
        String[] pro = {"crap", "odpro"};
        System.out.println(solution.amazonReviewScore(review, pro)); //15


        String review2 = "FastDeliveryOkayProduct";
        String[] pro2 = {"eryoka", "yo", "eli"};
        System.out.println(solution.amazonReviewScore(review2, pro2));//11

        String review3 = "ExtremeValueForMoney";
        String[] pro3 = {"tuper", "douche"};
        System.out.println(solution.amazonReviewScore(review3, pro3));//20

        String review4 = "xxxxxabcuuuuzxuuuZxYuu";
        String[] pro4 = {"ABC", "ZXY"};
        System.out.println(solution.amazonReviewScore(review4, pro4)); //13

        //xxxxx[abc]uuuuzxuuu[zxy]uu
        //xxxxxab
        //bcuuuuzxuuuzx ans = 13
        //xyuu
        //pro abc zxy
    }
}
//Input:  review = "GoodProductButScrapAfterWash", prohibitedWords = ["crap", "odpro"]
//        Output: 15//
//        The longest substring is "dProductButScra", return its length, 15.
//        Example 2:

//        Input:  review = "FastDeliveryOkayProduct", prohibitedWords = ["eryoka", "yo", "eli"]
//        Output: 11

//        Input:  review = "ExtremeValueForMoney", prohibitedWords = ["tuper", "douche"]
//        Output: 20
//        Explanation:
//
//        The review does not contain any prohibited word, so the longest substring is "ExtremeValueForMoney", length 20.

