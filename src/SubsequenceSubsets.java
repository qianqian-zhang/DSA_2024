import java.util.ArrayList;
import java.util.List;

public class SubsequenceSubsets {
    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(findAllSubsequence(str));
    }

    private static List<String> findAllSubsequence(String str) {
        helper(str, "");
        return list;
    }

    private static void helper(String str, String res) {
        //base condition
        if(str.length() == 0) {
            if(res.length() > 0) list.add(res);
            return;
        }

        char c = str.charAt(0);

        //pick it or not
        helper(str.substring(1), res + c);
        helper(str.substring(1), res);
    }
}
