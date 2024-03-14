package FindRecurringNames;

public class Main {
    public static void main(String[] args) {
        //realNames = ["rohn", "henry", "daisy"], allNames = []
        String[] realNames = {"rohn", "henry", "daisy"};
        String[] allNames = {"ryhen", "aisyd", "henry"};

        FindRecurringNames solution = new FindRecurringNames();
        String[] arr = solution.findRecurringNames(realNames, allNames);

        for(String s : arr) System.out.println(s);

        System.out.println("********");
        String[] realNames2 = {"tom", "jerry"};
        String[] allNames2 = {"reyjr", "mot", "tom", "jerry", "mto"};
        String[] arr2 = solution.findRecurringNames(realNames2, allNames2);

        for(String s : arr2) System.out.println(s);
    }
}
