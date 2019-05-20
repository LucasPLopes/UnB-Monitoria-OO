import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


public class TaskExecutor{
	public static void main(String []args){
		PrintTask pt[] = new PrintTask[3];
			pt[0] = new PrintTask("tarefa01");
			pt[1] = new PrintTask("tarefa02");
			pt[2] = new PrintTask("tarefa03");
		
		System.out.println("Início do ExecutorService");
		
		ExecutorService  es = Executors.newCachedThreadPool();
		
		es.execute(pt[0]);
		es.execute(pt[1]);
		es.execute(pt[2]);
		
		es.shutdown();
		
		System.out.println("Fim do ExecutorService");
		
		
	}
	
}
