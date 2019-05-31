

public class MyThread extends Thread{
	private String nome;
	private int tempo;
	
	
	public MyThread(String nome, int tempo){
		this.nome = nome;
		this.tempo = tempo;
		
		start();
	}
	
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
