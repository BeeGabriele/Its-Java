 
public class Domino{
    public static void sleep(int ms){
        try{
            Thread.sleep(ms); 
        }catch(InterruptedException ex){
        }
    }
    public static void main(String[] args) { 
        char[] frame = {'|','/','_'};
        int pos = 1;
        while(true){
            for(int i = 0; i < 10; i++){
                System.out.print(frame[0]);
            }
            sleep(400);
            System.out.print("\r");
            for(pos = 0; pos < 11; pos++){
                for(int j = 0; j < (pos - 1); j++ ){
                    System.out.print(frame[2]);
		    
                }
                System.out.print(frame[1]);
                for(int j = 0; j < (9 - pos); j++ ){
                    System.out.print(frame[0]);
		    
                }
                sleep(400);
                System.out.print("\r");
            }
            for(int i = 0; i < 10; i++){
                System.out.print(frame[2]);
		
            }
            sleep(400);
            System.out.print("\r");
        }
    }
}
