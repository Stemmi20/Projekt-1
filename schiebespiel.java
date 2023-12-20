import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class schiebespiel {

    // Größe des Spielfelds
    private static final int GROESSE = 3;
    // Platzhalter für das leere Feld
    private static final int LEERES_FELD = 0;

    // Das Spielfeld
    private static int[][] spielfeld;
    // Anzahl der gespielten Runden
    private static int gespielteRunden;

    public static void main(String[] args) {
        initialisiereSpielfeld();
        zeigeSpielfeld();

        // Spielrunden, bis das Spiel beendet ist
        while (!istSpielBeendet()) {
            spieleRunde();
            zeigeSpielfeld();
        }

        System.out.println("Herzlichen Glückwunsch! Du hast das Spiel in " + gespielteRunden + " Runden geschafft!");
    }

    // Initialisiert das Spielfeld mit zufälligen Zahlen
    private static void initialisiereSpielfeld() {
        spielfeld = new int[GROESSE][GROESSE];
        List<Integer> zahlen = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, LEERES_FELD);
        Collections.shuffle(zahlen);

        int index = 0;
        for (int i = 0; i < GROESSE; i++) {
            for (int j = 0; j < GROESSE; j++) {
                spielfeld[i][j] = zahlen.get(index++);
            }
        }
    }

    // Zeigt das Spielfeld in der Konsole an
    private static void zeigeSpielfeld() {
        System.out.println("Runden gespielt: " + gespielteRunden);
        for (int i = 0; i < GROESSE; i++) {
            for (int j = 0; j < GROESSE; j++) {
                System.out.print(spielfeld[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Führt eine Spielrunde durch
    private static void spieleRunde() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die Zahl ein, die du verschieben möchtest (0 zum Beenden): ");
        int zahlZumVerschieben = scanner.nextInt();

        // Spiel beenden, wenn 0 eingegeben wird
        if (zahlZumVerschieben == 0) {
            System.out.println("Spiel vorbei. Vielen Dank fürs Spielen!");
            System.exit(0);
        }

        // Überprüft, ob der Zug gültig ist
        if (!istGueltigerZug(zahlZumVerschieben)) {
            System.out.println("Ungültiger Zug. Bitte wähle eine benachbarte Zahl zum Verschieben.");
            spieleRunde();
            return;
        }

        // Führt den Zug aus und erhöht die Anzahl der gespielten Runden
        verschiebeZahl(zahlZumVerschieben);
        gespielteRunden++;
    }

    // Überprüft, ob der Zug gültig ist
    private static boolean istGueltigerZug(int zahl) {
        int[] leeresFeldPosition = findePosition(LEERES_FELD);
        int[] zahlPosition = findePosition(zahl);

        // Überprüft, ob die Zahl neben dem leeren Feld ist
        return (Math.abs(leeresFeldPosition[0] - zahlPosition[0]) + Math.abs(leeresFeldPosition[1] - zahlPosition[1])) == 1;
    }

    // Verschiebt die Zahl im Spielfeld
    private static void verschiebeZahl(int zahl) {
        int[] leeresFeldPosition = findePosition(LEERES_FELD);
        int[] zahlPosition = findePosition(zahl);

        // Tauscht die Positionen der Zahl und des leeren Feldes
        spielfeld[leeresFeldPosition[0]][leeresFeldPosition[1]] = zahl;
        spielfeld[zahlPosition[0]][zahlPosition[1]] = LEERES_FELD;
    }

    // Findet die Position einer Zahl im Spielfeld
    private static int[] findePosition(int zahl) {
        for (int i = 0; i < GROESSE; i++) {
            for (int j = 0; j < GROESSE; j++) {
                if (spielfeld[i][j] == zahl) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // Überprüft, ob das Spiel beendet ist
    private static boolean istSpielBeendet() {
        int zahl = 1;
        for (int i = 0; i < GROESSE; i++) {
            for (int j = 0; j < GROESSE; j++) {
                if (spielfeld[i][j] != zahl && !(i == GROESSE - 1 && j == GROESSE - 1 && spielfeld[i][j] == LEERES_FELD)) {
                    return false;
                }
                zahl++;
            }
        }
        return true;
    }
}