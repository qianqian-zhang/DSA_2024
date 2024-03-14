package CountUniqueStrings;

public class Main {
    public static void main(String[] args) {
        CountUniqueStrings solution = new CountUniqueStrings();

        System.out.println(solution.findNumberOfPossibleUniqueStrings("abc"));
        System.out.println(solution.countUnique("abc"));
        System.out.println(solution.findNumberOfPossibleUniqueStrings("abac"));
        System.out.println(solution.countUnique("abac"));
    }
}
//abac
//baac
//aabc
//abca
//acab
//caba