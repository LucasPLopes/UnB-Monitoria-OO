
//exemplo adaptado das aulas da Loiane :D

public class Principal{
	
	public static void main(String []args){
		MyThread mt[] = new MyThread[4];
		
		//lembrando que o método start() é inicializado no construtor 
		
		mt[1] = new MyThread("Luiza",450);
		mt[0] = new MyThread("Ana",250);
		mt[2] = new MyThread("Pedro",650);
		mt[3] = new MyThread("Luiz",750);
		
		
	}	
}
