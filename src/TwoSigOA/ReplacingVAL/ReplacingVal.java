package TwoSigOA.ReplacingVAL;

public class ReplacingVal {
        //given a 2d array, start pos
        //replace all cells connected to the pos 4 dimensionally with replacing val
        //same question as lc733
    public int[][] replacingNum(int replacingVal, int[][] arr, int[] pos) {
        // write your code here (lc733 might
        if(replacingVal == arr[pos[0]][pos[1]]) return arr;

        dfs(replacingVal, arr, pos[0], pos[1], arr[pos[0]][pos[1]]);

        return arr;
    }
    private void dfs(int replace, int[][] arr, int x, int y, int original) {
        if(x < 0 || x >= arr.length || y < 0 || y >= arr[0].length) return;
        if(arr[x][y] == replace || arr[x][y] != original) return;

        //mark as replace
        arr[x][y] = replace;

        //explore 4 sides
        dfs(replace, arr, x + 1, y, original);
        dfs(replace, arr, x - 1, y, original);
        dfs(replace, arr, x, y + 1, original);
        dfs(replace, arr, x, y - 1, original);


    }


}
