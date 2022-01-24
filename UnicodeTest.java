/**
* Vengono stampati i primi x caratteri unicode
*
* @Author: Gabriele Bee		 @Version: 24.01.2022
*
**/
public class UnicodeTest{
    public static void main(String[] args){
	if(args.length != 1) {
	System.out.println("Errore: Il programma richiede 1 argomento");
	}else{
            char Unicode = '\u0020';
            for (int i = 0x0000; i<=Integer.parseInt(args[0]) - 1; i++){
                int character = (char)Unicode + (char)i;
                char printed = (char)character;
                System.out.println("Char: " + Integer.toHexString(i + 0x0020) + "==> \'" + printed + "\'");
            }
	}
    }
}
