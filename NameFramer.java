import java.util.Scanner;

/**
 * 
 * Il programma stampa interattivamente il nome inserito
 * incorniciato utilizzando nel carattere c
 * con uno spessore width 
 *
 * @author Gabriele Bee @version 18.02.2022
 * 
 */

 public class FrameName{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Inserire Nome Utente: ");
	String nome = input.next();
	input.nextLine();
	System.out.print("Inserire un carattere per la cornice: ");
        String c = input.next();
	input.nextLine();
	System.out.print("Inserire lo spessore della cornice: ");
	int width = input.nextInt();
	input.nextLine();
        int nrCaratteri = nome.Length();
        int nrSpazi = args.length - 1;
        
        int lunghezza = nrSpazi + nrCaratteri + 2;
        System.out.print("\u250C");
	for(int j = 0; j<width;j++){
            for(int i = 0; i < lunghezza; i++){
                System.out.println(c);
            }
	}
    }
}
