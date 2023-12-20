import java.util.Arrays;
import java.util.Scanner;

public class VerschiebeSpiel {
    public static void test(String[] args) {

        // int max = 8;
        // int min = 1;
        // int range = max - min + 1;

        String[][] board = { { "1", "4", "7" }, { "2", "6", "5" }, { "3", "8", "" }, };

        // for (int i = 0; i < 8; i++) {
        // int rand = (int) (Math.random() * range) + min;
        // String rands = String.valueOf(rand);
        // for (int j = 0; j < board.length; j++) {

        // }
        // }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                System.out.print(board[i][j] + "\t");
            }

            System.out.println("\n");
        }

        String[][] endzustand = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "" } };

        return Arrays.deepEquals(board, endzustand);
    }

    Scanner eingabe = new Scanner(System.in);
    String userInput = eingabe.nextLine();for(
    int i = 0;i<nummern.length;i++)
    {

    }

    String[] endzustand = { "1", "2", "3", "4", "5", "6", "7", "8", "" };

    return Arrays.deepEquals(nummern,endzustand);

    System.out.println(userInput);

    for(
    int i = 0;i<board.length;i++)
    {
        for (int j = 0; j < board[i].length; j++) {

            System.out.print(board[i][j] + "\t");
        }

        System.out.println("\n");
    }

    String[] nummern; // definiere Array um dem Hauptprogramm zu übergeben

    String x;
    String y;
    String z;
    String w;

    nummern=null;

    // Erste Reihe ----------------------------------------------
    // ----------------------------------------------------------
    if(board[1][1]=="")
    {

        x = board[1][2];
        y = board[2][1];

        nummern = new String[] { x, y };
        return nummern;
    };

    if(board[1][2]=="")
    {
        x = board[1][1];
        y = board[1][3];
        z = board[2][2];
        nummern = new String[] { x, y, z };
        return nummern;
    };

    if(board[1][3]=="")
    {

        x = board[1][2];
        y = board[2][3];

        nummern = new String[] { x, y };
        return nummern;
    };

    // Zweite Reihe ---------------------------------------------
    // ----------------------------------------------------------

    if(board[2][1]=="")
    {
        x = board[1][1];
        y = board[2][2];
        z = board[3][1];
        nummern = new String[] { x, y, z };
        return nummern;
    };

    if(board[2][2]=="")
    {
        x = board[1][2];
        y = board[2][1];
        z = board[2][3];
        w = board[3][2];
        nummern = new String[] { x, y, z, w };
        return nummern;
    };

    if(board[2][3]=="")
    {
        x = board[1][3];
        y = board[2][2];
        z = board[3][3];
        nummern = new String[] { x, y, z };
        return nummern;
    };

    // Dritte Reihe ---------------------------------------------
    // ----------------------------------------------------------
    if(board[3][1]=="")
    {

        x = board[2][1];
        y = board[3][2];

        nummern = new String[] { x, y };
        return nummern;
    };

    if(board[3][2]=="")
    {
        x = board[3][1];
        y = board[3][3];
        z = board[2][2];
        nummern = new String[] { x, y, z };
        return nummern;
    };

    if(board[3][3]=="")
    {

        x = board[3][2];
        y = board[2][3];

        nummern = new String[] { x, y };
        return nummern;
    };return nummern;
}}