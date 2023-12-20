import java.util.Scanner;
import java.util.Arrays;

public class Check_nummer_moveable {
public static void moveable(String[] args) {
    String[] nummern = Nummber_to_move_terminal.getNumbers(board);
        Scanner eingabe = new Scanner(System.in);
        String userInput = eingabe.nextLine();

        
        for (int i =0; i < nummern.length; i++){
            
        }


            String[] endzustand = {  "1", "2", "3" , "4", "5", "6" , "7", "8", ""};
    
            return Arrays.deepEquals(nummern, endzustand);
        }

        System.out.println(userInput);
    }