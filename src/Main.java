import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
//        //1, 1, 1, 0, 1
//        int[] binary = {0, 1, 1, 0, 1};
//        String binaryStr = arrayToBinaryString(binary);
//
//        //convert binary string to decimal
//        int decimal = Integer.parseInt(binaryStr, 2);
//        System.out.println("decimal: " + decimal);
//
//        System.out.println("decimal: " + BinaryToDecimal.binaryToDecimal(binary));
//        System.out.println("decimal: " + BinaryToDecimal.binaryToDecimal2(binary));

//        StringBuilder sb = new StringBuilder();
//
//        sb.append(1);
//
//        sb.append(3);
//
//        System.out.println(sb.toString());

        GCD g = new GCD();

        System.out.println(g.findGCD(8, 6));

    }

    private static String arrayToBinaryString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for(int n : arr) {
            sb.append(n);
        }

        return sb.toString();
    }
}
