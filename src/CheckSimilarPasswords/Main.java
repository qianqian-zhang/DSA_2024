package CheckSimilarPasswords;

public class Main {
    public static void main(String[] args) {
        String[] newPass = {"baacbab", "accdb", "baacba"};
        String[] oldPass = {"abdbc", "ach", "abb"};
        CheckSimilarPasswords solution = new CheckSimilarPasswords();
        String[] ans = solution.checkSimilarPasswords(newPass, oldPass);
        for(String a : ans) System.out.println(a); //["YES", "NO", "YES"

        System.out.println("*****");

        String[] newPass2 = {"aaccbbee", "aab"};
        String[] oldPass2 = {"bdbf", "aee"};
        String[] ans2 = solution.checkSimilarPasswords(newPass2, oldPass2);
        for(String a : ans2) System.out.println(a); //"YES", "NO"
    }
}