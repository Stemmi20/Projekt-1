import java.util.Arrays;

public class Generatefield {
    public static void main(String[] args) {

        String[][] board = { { "1" }, { "2" }, { "3" }, { "4" }, { "5" }, { "6" }, { "7" }, { "8" }, { "" }, };


        // int[][] board = new int[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                String s = String.valueOf(i);
                board[i][j] = s + j;
            }
        }

        for (int[] a : board) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }

        // System.out.println("another way to print 2D arrays");
        // System.out.println(Arrays.deepToString(board));

        // String[][] verschiebeSpielnummber = { randomStrings, randomStrings, randomStrings, randomStrings, randomStrings,
                // randomStrings, randomStrings, randomStrings, randomStrings };
        // print(verschiebeSpiel);
    }

    private static void print(String[][] verschiebeSpielnummber) {
        print(verschiebeSpielnummber);
    }
}