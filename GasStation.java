/**
* Viene stampata una pompa di benzina con il prezzo che sceglie l'utente al momento dell'avvio
*
* @Author: Gabriele Bee		 @Version 21.01.2022
*
**/
public class GasStation{
    public static void main (String[] args){
        if(args.length != 1){ 
            System.out.print("Errore: Il programma richiede 1 argomento"); 
        }else{
            if(Integer.parseInt(args[0]) <= 999){
                int a = Integer.parseInt(args[0]) / 100;
                int b = (Integer.parseInt(args[0]) - a * 100) / 10;
                int c = (Integer.parseInt(args[0]) - a * 100 - b * 10);
                System.out.println(" _________ ");
                System.out.println("|  - - -  |");
                System.out.println("| |" + a + "|" + b + "|" + c + "| |");
                System.out.println("|  -.- -  |");
                System.out.println("|_________|");
                System.out.println(" |       | ");
                System.out.println(" |       | ");
                System.out.println("_|_______|_");
            }else{
	            System.out.println("Errore: Il numero inserito e' troppo grande");
	        }
        }
    }
}
