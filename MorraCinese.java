/**
 * Morra cinese contro un bot
 * 
 * @author Gabriele Bee @version 19.2.22
 */

import java.util.*;
public class MorraCinese {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Fai la tua scelta: ");
        System.out.println("1. Sasso");
        System.out.println("2. Carta");
        System.out.println("3. Forbici");
        System.out.print("> ");
        int input = 0;
        try{
            input = scan.nextInt();
            String output1 = "";
            String output2 = "";
            if(input > 3 || input < 1 ){
                System.out.print("Errore: input invalido. Scegliere un numero da 1 a 3.");
             } else {
                 if(input == 1){
                    output1 = "Sasso";
                 } else if(input == 2){
                     output1 = "Carta";
                 } else if(input == 3){
                     output1 = "Forbici";
                 }
                Random CPU = new Random();
                int scelta = CPU.nextInt(1,4);
                if (scelta == 1){
                    output2 = "Sasso";
                } else if(scelta == 2){
                    output2 = "Carta";
                } else if(scelta == 3){
                    output2 = "Forbici";
                } 
                System.out.println("Player: " + output1 + " vs. CPU: " + output2);
                if(input == scelta){
                    System.out.println("Pareggio!");
                } else if (input == 1 && scelta == 3) {
                    System.out.println("Hai vinto!");
                } else if (input == 2 && scelta == 1) {
                    System.out.println("Hai vinto!");
                } else if (input == 3 && scelta == 2) {
                    System.out.println("Hai vinto!");
                } else if (input == 2 && scelta == 3) {
                    System.out.println("Hai perso. Riprova!");
                } else if (input == 3 && scelta == 1) {
                    System.out.println("Hai perso. Riprova!");
                } else if (input == 1 && scelta == 2) {
                    System.out.println("Hai perso. Riprova!");
                } 
             }
        } catch(InputMismatchException e) {
            System.out.print("Errore: input invalido. Scegliere un numero da 1 a 3.");
        }
    }
}
