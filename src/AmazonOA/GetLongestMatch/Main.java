package AmazonOA.GetLongestMatch;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GetLongestMatch solution = new GetLongestMatch();

        List<String[]> list = new ArrayList<>();

        list.add(new String[]{"abcdefg", "sfd*d"});
        list.add(new String[]{"abcdefg", "f*bc"});
        list.add(new String[]{"abcdefg", "*bcd"});
        list.add(new String[]{"abcdefg", "de*"});
        list.add(new String[]{"aaasaabcbcbc", "a*bc"});
        list.add(new String[]{"ac", "ac*"});
        list.add(new String[]{"acsddfsd", "sd*s"});

        for(String[] input : list) {
            System.out.println("text: " + input[0] + ", regex: " + input[1] + ", output: " + solution.getLongestMatch(input[0], input[1]));
        }
        System.out.println("*************built in function**************");
        for(String[] input : list) {
            System.out.println("text: " + input[0] + ", regex: " + input[1] + ", output: " + solution.getLongestMatchBuiltIn(input[0], input[1]));
        }
    }
}
