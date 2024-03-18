package AmazonVO.NumberOfIslands;

public class Main {
    public static void main(String[] args) {
        NumberOfIslands solution = new NumberOfIslands();

        char[][] grid = {{'0', '1', '1', '0'}, {'0', '1', '0', '0'}, {'0', '0', '0', '1'}}; //2

        System.out.println(solution.numOfIslandsDFS(grid));
    }
}

//0,1,1,0
//0,1,0,0
//0,0,0,1

//0,0,0,0
//0,0,0,0
//0,0,0,1