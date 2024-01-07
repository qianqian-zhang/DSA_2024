public class RecursionPatternQuestions {
    public static void main(String[] args) {
        printTriangle(5,0);
        System.out.println();
        printTriangle2(5,0);
        System.out.println();
        deleteChar("adesaw", new String(), 'a');

    }

    private static void printTriangle(int row, int col) {
        // 0       row
        // * * * * 4
        // * * *   3
        // * *     2
        // *       1
        //row = [1, 4], col = [0, row - 1]

        //base condition
        if(row == 0) return;

        if(col < row) { //on one row
            System.out.print("*");
            printTriangle(row, col + 1);
        }else { //next row
            System.out.println();
            printTriangle(row - 1, 0);
        }
    }

    private static void printTriangle2(int row, int col) {
        //base condition
        if(row == 0) return;

        if(col < row) { //on one row
            printTriangle2(row, col + 1);
            System.out.print("*");
        }else { //next row
            printTriangle2(row - 1, 0);
            if(row > 1) {
                System.out.println();
            }

        }
    }


    private static void deleteChar(String str, String ans, Character target) {
        //abcae target = 'a' print bce
        if(str == "") {
            System.out.print(ans);
            return;
        }

        Character cur = str.charAt(0);
        if(cur == target) {
            //skip it, delete first char of the str
            deleteChar(str.substring(1), ans, target);
        }else {
            ans += cur;
            deleteChar(str.substring(1), ans, target);
        }
    }
}
