public class CatchTheChicken{
    public static void main(String[] args){
        try {

           //posizioni
            int yFarmer = Integer.parseInt(args[0]);
            int xFarmer = Integer.parseInt(args[1]);
            int yChicken = Integer.parseInt(args[2]);
            int xChicken = Integer.parseInt(args[3]);


            //direzione Nord/Sud

            if(yFarmer - yChicken > 0){
               System.out.print("N");
            }else if(yFarmer - yChicken < 0){
               System.out.print("S");
            }


            //Direzione East/West
            if(xFarmer - xChicken > 0){
               System.out.print("W");
            }else if(xFarmer - xChicken < 0){
               System.out.print("E");
            }
        } catch (NumberFormatException e) {
            int i = 0;
             try {
                 
                 int a = 0;
                for( i = 0; i<4; i++ ){
                    
                    a = Integer.parseInt(args[i]);

                }
            } catch (NumberFormatException exception) {
                System.out.print("ERRORE: Uno o piu' valori passati non sono accettabili. Errore nel " + (i + 1) + " argomento.");
            }


            
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("ERRORE: Non sono stati inseriti sufficienti argomenti. Richiesti: 4.");
        }
    }
}