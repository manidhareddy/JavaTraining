class ThreadDemo implements Runnable{
	@Override
	public void run(){
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("Thread is executing "+i);
		}
	}
}
public class RunnableInterface{
	public static void main(String[] args) throws Exception{
		ThreadDemo cart = new ThreadDemo();
		//we need to create thread object
		Thread thread = new Thread(cart,"cart thread");
		thread.start();
		for(int i = 0 ; i < 10 ; i++){
			Thread.sleep(100);
			System.out.println("Main thread is executing");
		}
	}
}