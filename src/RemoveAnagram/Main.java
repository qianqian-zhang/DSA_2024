package RemoveAnagram;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"code", "doce", "ecod", "framer", "frame"};
        RemoveAnagram solution = new RemoveAnagram();
        String[] ans = solution.removeAnagram(arr);

        for(String a : ans) System.out.println(a);
    }
}
