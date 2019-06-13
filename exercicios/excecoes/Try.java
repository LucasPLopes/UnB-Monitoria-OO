import java.lang.Exception;
import java.lang.ArrayIndexOutOfBoundsException;

public class Try{
    
    public static void main(String[] args) {

   
            
            try{

               int N = Integer.parseInt(args[0]);
               if( N %3 == 0)
                    throw new Exception("Multiplo de 3");
                else 
                    System.out.println("Não é múltiplo, N = "+ N);

            }catch(ArrayIndexOutOfBoundsException e){ //java Try

                System.out.println("Dentro do bloco catch: ArrayIndexOutOfBoundsException");
                System.out.println(e.getMessage());

            }catch(Exception e){ // java Try asjdansk

                System.out.println("Dentro do bloco catch: Exception");
                System.out.println(e.getMessage());

                try{
                    throw new Exception("Dentro do bloco try interno");
                }catch(Exception ee){    
                    System.out.println(ee.getMessage());
                }finally{
                    System.out.println("finally dentro do catch");
                }
            }finally{
                System.out.println("Dentro do bloco finally");
                System.exit(0);
                System.out.println("A partir daqui nunca será executado");

            }


    }
}
