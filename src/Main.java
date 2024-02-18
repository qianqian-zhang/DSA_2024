import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        String str = "Hello";

        func(str);

        System.out.println(str);

    }

    private static String func(String s){
        s = "!!" + s + "!!";

        return s;
    }

    private static String arrayToBinaryString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for(int n : arr) {
            sb.append(n);
        }

        return sb.toString();
    }
}
