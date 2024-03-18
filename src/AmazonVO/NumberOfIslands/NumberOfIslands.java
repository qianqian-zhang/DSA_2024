package AmazonVO.NumberOfIslands;
//binary grid m * n
//'0' denotes water, '1'denotes land
//an island is 1s that are four directionally connected
//return number of islands
public class NumberOfIslands {
    public int numOfIslandsDFS(char[][] grid) {
//        Time complexity : O(M×N) where M is the number of rows and Nis the number of columns.
//        Space complexity : worst case O(M×N) in case that the grid map is filled with lands where DFS goes by M×N deep.
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int x, int y) {
        //base condition
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0') return;

        //mark visited island cells with '0'
        grid[x][y] = '0';

        dfs(grid, x + 1, y);
        dfs(grid, x - 1, y);
        dfs(grid, x, y + 1);
        dfs(grid, x, y - 1);
    }
//
//    public int numOfIslandsBFS(char[][] grid) {
//
//    }
//
//    public int numOfIslandsUF(char[][] grid) {
//
//    }
}

//1. DFS

//2. BFS

//3. Union Find