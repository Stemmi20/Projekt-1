public class VerschiebeSpiel {
    public static void test(String[] args) {
        new Generatefield();
        new Check_Game_Over();

        // x = Check_Game_Over.checkGame(board);
        // if (x = false) {
            new Check_nummer_moveable();
            new Nummber_to_move_terminal();
            new Moves();
            new Display();
            new Check_Game_Over();
        }
    }
// }