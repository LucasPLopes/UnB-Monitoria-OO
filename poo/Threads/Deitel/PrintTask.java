import java.security.SecureRandom;


public class PrintTask implements Runnable{
	private static final SecureRandom generator = new SecureRandom();
	private final int sleepTime;
	private final String Nome;
	
	
	public PrintTask( String pt){
		Nome = pt;
		sleepTime = generator.nextInt(7000);
	}
	
	public void run(){
		try{
			System.out.printf("%s irá dormir por %d milisegundos.%n",Nome, sleepTime);
			Thread.sleep(sleepTime);
			
		}catch (InterruptedException e){
			e.printStackTrace();
			Thread.currentThread().interrupt();
			
			
		}
		System.out.printf("%s terminou a soneca%n",Nome);
	}
	
	
	/*public static void main(String [] args){
			PrintTask pt = new PrintTask("Minha Thread");
			pt.run();			
	}	
	*/
}
