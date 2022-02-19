
/**
 * Morra cinese contro un bot
 * 
 * @author Gabriele Bee @version 19.2.22
 */

import java.util.*;

public class MorraCinese {
    public static void main(String[] args) {

        int input = 0;
        int playerPoints = 0;
        int cpuPoints = 0;
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Fai la tua scelta: ");
                System.out.println("1. Sasso");
                System.out.println("2. Carta");
                System.out.println("3. Forbici");
                System.out.println("0. Exit");
                System.out.print("> ");
                input = scan.nextInt();
                String output1 = "";
                String output2 = "";
                if (input > 3 || input < 1) {
                    if (input == 0) {
                        break;
                    } else {
                        System.out.print("Errore: input invalido. Scegliere un numero da 1 a 3.");
                    }
                } else {
                    if (input == 1) {
                        output1 = "Sasso";
                    } else if (input == 2) {
                        output1 = "Carta";
                    } else if (input == 3) {
                        output1 = "Forbici";
                    }
                    Random CPU = new Random();
                    int scelta = CPU.nextInt(1, 4);
                    if (scelta == 1) {
                        output2 = "Sasso";
                    } else if (scelta == 2) {
                        output2 = "Carta";
                    } else if (scelta == 3) {
                        output2 = "Forbici";
                    }
                    System.out.println("Player: " + output1 + " vs. CPU: " + output2);
                    if (input == scelta) {
                        System.out.println("Pareggio!");
                    } else if (input == 1 && scelta == 3) {
                        System.out.println("Hai vinto!");
                        playerPoints++;
                    } else if (input == 2 && scelta == 1) {
                        System.out.println("Hai vinto!");
                        playerPoints++;
                    } else if (input == 3 && scelta == 2) {
                        System.out.println("Hai vinto!");
                        playerPoints++;
                    } else if (input == 2 && scelta == 3) {
                        System.out.println("Hai perso. Riprova!");
                        cpuPoints++;
                    } else if (input == 3 && scelta == 1) {
                        System.out.println("Hai perso. Riprova!");
                        cpuPoints++;
                    } else if (input == 1 && scelta == 2) {
                        System.out.println("Hai perso. Riprova!");
                        cpuPoints++;
                    }
                    System.out.println("PUNTEGGIO:");
                    System.out.println("Player: " + playerPoints + " - CPU: " + cpuPoints);
                    System.out.print(\n\n);
                    }
                }
            } catch (InputMismatchException e) {
                System.out.print("Errore: input invalido.");
                break;
            }
        }
    }
}
