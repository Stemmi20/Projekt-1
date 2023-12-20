import java.util.Arrays;
import java.util.Random;

public class Generatefield {
    public static void main(String[] args) {

        String[][] board = { { "1", "4", "7" }, { "2", "6", "5" }, { "3", "8", "" }, };

        Random rand = new Random();

        for (int i = 0; i < board.length; i++) {
            int randomIndexToSwap = rand.nextInt(board.length);
            String[] temp = board[randomIndexToSwap];
            board[randomIndexToSwap] = board[i];
            board[i] = temp;
        }
        System.out.println(Arrays.toString(board));

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }

            System.out.println("\n");
        }
    }

    public String[] getBoard() {
        return getBoard();
    }

}
