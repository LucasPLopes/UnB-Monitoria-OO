import java.security.SecureRandom;


//exemplo adaptado do livro do Deitel 10ª 
public class Dado{
	
	public static void main(String [] args){	
	
			SecureRandom sr = new SecureRandom();
			int [] frequencia = new int[13];
			
			for(int i= 0 ; i < 1000000 ; i++)
			++frequencia[1+ sr.nextInt(12)];
			
			
			System.out.println("Qual a soma se lançarmos dois dados.");
			System.out.println("Soma x Quantidade:");
			for( int i =1 ; i<= 12;i++)
				System.out.printf("%d\t%d\n",i, frequencia[i]);
		
	}	
}
