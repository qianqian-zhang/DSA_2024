package AmazonOA.FindMInInefficiency;

public class FindMinInefficiency {

    public int findMinimumInefficiency(String serverType) {
        //given a binary string with wildcard chars
        //you can replace wildcard with either 0 or 1
        //find minimum number of adjacent pairs that have different values

        //algo: replace wildcard with char before it

        //edge case: there are leading wildcard chars
        int n = serverType.length();
        int idx = 0;
        char[] arr = serverType.toCharArray();
        while(idx < n && arr[idx] == '?') {
            idx++;
        }

        //check if there is leading ?
        int min = 0;

        for(int i = idx + 1; i < n; i++) {
            //compare adjacent pair [i - 1, i]
            if(arr[i] == '?') {
                arr[i] = arr[i - 1];
            }else{
                if(arr[i] != arr[i - 1]) min++;
            }
        }

        return min;

    }


//"??011??0"
//00011000 ans = 2

//00?10??1?
//00[010]0[01]1 ans = 3
}
