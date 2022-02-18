import java.util.Scanner;

/**
 * 
 * Il programma stampa la stringa inserita all'avvio del comando
 * incorniciata con dei caratteri Unicode
 * 
 * @author Gabriele Bee @version 18.02.2022
 * 
 */

 public class FrameName{
    public static void main(String[] args){
        char lato = '\u2500';
        int nrCaratteri = 0;
        int nrSpazi = args.length - 1;
        for(int i = 0; i< args.length; i++){
            nrCaratteri += args[i].length();
        }
        
        int lunghezza = nrSpazi + nrCaratteri + 2;
        System.out.print("\u250C");
        for(int i = 0; i < lunghezza; i++){
            System.out.print(lato);
        }
        System.out.println("\u2510");
        System.out.print("\u2502 ");
        for(int i = 0; i< args.length; i++){
            System.out.print(args[i] + " ");
        }
        System.out.println("\u2502");
        System.out.print("\u2514");
        for(int i = 0; i < lunghezza; i++){
            System.out.print(lato);
        }
        System.out.print("\u2518");
    }
}
