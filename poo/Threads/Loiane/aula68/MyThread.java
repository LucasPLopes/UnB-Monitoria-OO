//a main é a mesma da aula 67 e o diferencial é que usamos uma interface ao invés da herança


					//implementação da interface
public class MyThread implements  Runnable{
	private String nome;
	private int tempo;
	
	
	public MyThread(String nome, int tempo){
		this.nome = nome;
		this.tempo = tempo;
		
		Thread thread = new Thread(this);
		
		thread.start();
	}
	
	//sobreescrita do método 
	@Override
	public void run(){
		try{
			for(int i =0;i <=10 ;i++)
			{	
				System.out.println(nome + ", contador " + i);
				Thread.sleep(tempo);
			}
		}catch( InterruptedException e){
			e.printStackTrace();
			
		}
		
	}


}
