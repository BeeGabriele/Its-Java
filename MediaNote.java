/**
* Il programma stampa la media dei valori inseriti dall'utente
*
* @Author: Gabriele Bee		@Version: 24.01.2022
*
**/
public class MediaNote{
    public static void main(String[] args){
        double somma = 0.00;
	for(int i = 0; i <= args.length - 1; i++){
	    double addendo = Double.parseDouble(args[i]);
	    somma = somma + addendo;
	    System.out.println("Nota" + (i + 1) + ": " + addendo);
	}
	double media = somma/args.length;
	System.out.println("-----------");
	System.out.println(String.format("Media: %.2f",media));
    }
}
