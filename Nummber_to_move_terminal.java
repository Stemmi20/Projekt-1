public class Nummber_to_move_terminal {

  public static String[] getNumbers(String[][] board){ 
  String[] nummern;                          //definiere Array um dem Hauptprogramm zu übergeben

  String x;
  String y;
  String z;
  String w;

  nummern = null;

  //Erste Reihe ----------------------------------------------
  //----------------------------------------------------------
  if (board[0][0] == "" ) {

    x = board[0][1];
    y = board[1][0];

    nummern = new String[] {x, y};
    return nummern;
  };

  if (board[0][1] == "") {
    x = board[0][0];
    y = board[0][2];
    z = board[1][1];
    nummern = new String[] {x, y, z};
    return nummern;
  };

  if (board[0][2] == "") {

    x = board[0][1];
    y = board[1][2];

    nummern = new String[] {x, y};
    return nummern;
  };

  //Zweite Reihe ---------------------------------------------
  //----------------------------------------------------------

  if (board[1][0] == "") {
    x = board[0][0];
    y = board[1][1];
    z = board[2][0];
    nummern = new String[] {x, y, z};
    return nummern;
  };

  if (board[1][1] == "") {
    x = board[0][1];
    y = board[1][0];
    z = board[1][2];
    w = board[2][1];
    nummern = new String[] {x, y, z, w};
    return nummern;
  };

   if (board[1][2] == "") {
    x = board[0][2];
    y = board[1][1];
    z = board[2][2];
    nummern = new String[] {x, y, z};
    return nummern;
  };

  //Dritte Reihe ---------------------------------------------
  //----------------------------------------------------------
if (board[2][0] == "") {

    x = board[1][0];
    y = board[2][1];

    nummern = new String[] {x, y};
    return nummern;
  };

  if (board[2][1] == "") {
    x = board[2][0];
    y = board[2][2];
    z = board[1][1];
    nummern = new String[] {x, y, z};
    return nummern;
  };

  if (board[2][2] == "") {

    x = board[2][1];
    y = board[1][2];

    nummern = new String[] {x, y};
    return nummern;
  };
  return nummern;
}}