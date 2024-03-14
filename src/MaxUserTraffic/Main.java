package MaxUserTraffic;

public class Main {
    public static void main(String[] args) {
        MaxUserTraffic solution = new MaxUserTraffic();
        int[] login = {1,2,3};
        int[] logout = {10, 8, 4};
        int[] login2 = {1,2,2,7};
        int[] logout2 = {10, 5,4, 12};
        System.out.println(solution.maximumUserTraffic(login, logout));
        System.out.println(solution.maxUserTraffic(login, logout));
        System.out.println(solution.maximumUserTraffic(login2, logout2));
        System.out.println(solution.maxUserTraffic(login2, logout2));
    }
}
// [            ]

//     [                  ]
//                    [        ]

//1  5
//2 10
//7 12

//duration = 4 + 4 = 8