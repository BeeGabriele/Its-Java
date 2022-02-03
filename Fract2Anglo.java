/**
* Inseriti due valori int <divisore> e <dividendo> viene stampato il risultato della frazione
* in formato anglosassone
* 
* @Author: Gabriele Bee		@Version: 21.02.2022
**/
import static java.lang.System.out;
public class Fract2Anglo {
	public static void main(String[] args){
		if(args.length != 2){
			out.print("Il programma richiede 2 argomenti, non di piu' e non di meno");
		}else{
			int dividendo= Integer.parseInt(args[0]);
			int divisore= Integer.parseInt(args[1]);
			double divisione= (double)dividendo/(double)divisore;
			out.print("Il risultato della frazione e': " + divisione);
		}
	}
}
