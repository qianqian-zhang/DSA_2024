package AmazonOA.ReturnRecords;

public class Main {
    public static void main(String[] args) {
        ReturnRecords solution = new ReturnRecords();

        String[] arr = {"register user05 qwerty", "login user05 qwerty", "logout user05"};

        String[] ans = solution.returnRecords(arr);

        for(String a : ans) System.out.println(a);

        System.out.println("****");

        String[] arr2 = {"register david david123", "register adam 1Adam1", "login david david123", "login adam 1adam1", "logout david"};

        String[] ans2 = solution.returnRecords(arr2);

        for(String a : ans2) System.out.println(a);


    }
}
