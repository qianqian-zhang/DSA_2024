package AmazonOA.MaxBookCopies;

public class Main {
    public static void main(String[] args) {
        MaxBookCopies solution = new MaxBookCopies();
        int[] ans = solution.maximumBookCopies(new int[]{6, 6, 2, -6, -2, - 6});
        for(int a : ans) {
            System.out.print(a + ", ");
        }
    }
}
//Input:  portalUpdate = [6, 6, 2, -6, -2, - 6]
//        Output: [1, 2, 2, 1, 1, 0]
//        Explanation:
//
//        The inventory will be updated as follows:
//
//        After the first update, the inventory contains one copy of book ID 6. Maximum copies = 1, of book ID 6.
//
//
//        After the second update, the inventory contains two copies of book ID 6. Maximum copies = 2, of book ID 6.
//
//
//        After third update, the inventory contains two copies of book ID 6 and one copy of book ID 2. Maximum copies = 2, off book ID 6.
//
//
//        After the fourth update, the inventory contains one copy of book ID 6 and one copy of book ID 2. Maximum copies = 1, of book ID 6 or book ID 2. E: After the fifth update, the inventory contains one copy of book ID 6. Maxmum copies = 1, of book ID 6.
//
//
//        After the last upate, the inventory is empty. Maximum copies = 0, no books are present.
//
//
//        The answer is [1, 2, 2, 1, 1, 0].
//        Example 2:
//
//        Input:  portalUpdate = [1, 2, -1, 2]
//        Output: [1, 1, 1, 2]
//        Explanation:
//
//        Unknown so far 🥹 If you know about it, feel free to let me know.. But you can still use this example to test your code 💪
//
