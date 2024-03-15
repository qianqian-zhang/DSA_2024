package AmazonOA.FindMinOperations;

public class FindMinOps {

    public int findMinimumOperations(String image) {
        //given a binary string
        //pick  a char, append it to the end
        //min number of operations needed to reverse the string

        //longest sequence
        int n = image.length();
        String reverse = reverseStr(image);

        int count = 0; //longest sequence

        int index = 0;

        for(int i = 0; i < n; i++) {
            char c = image.charAt(i);

            if(c == reverse.charAt(index)) {
                count++;
                index++;
            }
        }

        return n - count;
    }

    public String reverseStr(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(arr);
    }

//0100110
//0110010
}
