package SnowflakeOA.MaximumSubstrings;

import java.util.PriorityQueue;

public class MaximumSubstrings {

    public int getMaxBeautifulSubstrings(String color) {
        // given a string
        //you can replace . with any letter
        //find maximum number of substring consisting of one unique char

        //priorityqueue, expand
        //edge case: ....  aaaabb
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        char[] arr = color.toCharArray();
        int n = arr.length;
        if(n == 1) return 1;

        int left = 0;
        int right = 0;
        //.aa.bb.
        int wildCard = 0;
        while(right < n) {
            if(arr[right] == '.') {
                right++;
                wildCard++;
                continue;
            }

            left = right;
            while(right < n && arr[right] == arr[left]){
                right++;
            }

            int len = right - left;
            pq.offer(new int[]{len, left, right - 1});

        }

        //.....
        if(wildCard == n) return (n + 1) * n / 2;

        int ans = 0;
        while(!pq.isEmpty()) {
            int[] cur = pq.poll();

            int count = expand(arr, cur[1], cur[2]);

            ans += (count + 1) * count / 2;

        }
        for(char c : arr) {
            System.out.print(c + " ");
        }
        return ans;
    }

    private int expand(char[] arr, int left, int right) {
        char c = arr[left];
        int count = right - left + 1;
        while(left - 1>= 0 && arr[left - 1] == '.') {
            arr[left - 1] = c;
            count++;
            left--;
        }
        while(right + 1 < arr.length && arr[right + 1] == '.') {
            arr[right + 1] = c;
            count++;
            right++;
        }

        return count;
    }


}










//WRONG ALGO
//    char[] arr = color.toCharArray();
//    int n = arr.length;
//        if(n == 1) return 1;
//
//    char lastChar = arr[0];
//        for(int i = 1; i < n; i++) {
//        if(arr[i] == '.') {
//            if(lastChar != '.') arr[i] = lastChar;
//        }else{
//            lastChar = arr[i];
//        }
//    }
//    //relace . with last char after it
//    lastChar = arr[n - 1];
//
//        for(int i = n - 2; i >= 0; i--) {
//        if(arr[i] == '.') {
//            if(lastChar != '.') {
//                arr[i] = lastChar;
//            }
//        }else{
//            lastChar = arr[i];
//        }
//    }
//
//    //find consecutive substrings
//    int ans = 0;
//    int len = 1;
//        for(char c : arr) {
//        System.out.print(c + " ");
//    }
//        for(int i = 1; i < n; i++) {
//        if(arr[i] == arr[i - 1]) {
//            len++;
//        }else{
//            //ans += len + len - 1 + len - 2 + ... + 1
//            ans += (1 + len) * len / 2;
//            len = 1;
//        }
//    }
//
//    ans += (1 + len) * len / 2;
//
//        return ans;

//c.bb
//ccbb  c c b b cc bb
//cbbb  c b b b bb bb bbb

//.a.bb.
//aabbbb 3 + 4 + 3 +2 + 1 = 13

//n
//n + n - 1 + n - 2 + ... + 1 number of substrings