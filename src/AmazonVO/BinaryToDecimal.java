package AmazonVO;

public class BinaryToDecimal {
    public static int binaryToDecimal(int[] arr) {
        // int[] binaryArray = {1, 0, 1, 0, 1};

        //read from most sig -> least sig
        int decimal = 0;

        for(int n : arr) {
            decimal = decimal * 2 + n;
        }

        return decimal;
    }
    public static int binaryToDecimal2(int[] arr) {
        // int[] binaryArray = {1, 1, 1, 0, 1};

        //read from least sig -> most sig
        int decimal = 0;
        int power = 0;

        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 1) {
                decimal += (int)Math.pow(2, power);
            }

            power++;
        }

        return decimal;
    }

}
