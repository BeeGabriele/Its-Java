/**
* Viene stampato il numero di monete necessarie per comporre il numero inserito
*
* @Author: Gabriele Bee		 @Version: 24.01.2022
*
**/
public class CoinCalculator{
    public static void main(String[] args){
        if(args.length != 1){ 
            System.out.print("Errore: Il programma richiede 1 argomento"); 
        }else{
            int argomento = Integer.parseInt(args[0]);
            int cinque = argomento / 5;
            int due = (argomento - cinque * 5) / 2;
            int uno = ((argomento - cinque * 5) - due * 2);
            System.out.println("       .-.   .---.");
            System.out.println(" (1)  ( 2 ) |  5  |");
            System.out.println(" | |  |\'-\'| |\'---\'|");
            System.out.println(" | |  |\'-\'| |\'---\'|");
            System.out.println(" \'-\'   \'-\'   \'---\' ");
            System.out.println("  " + uno + "     " + due + "      " + cinque);
        }
    }
}