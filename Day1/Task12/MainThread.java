class FirstThread extends Thread{
	@Override
	public void run(){
		int count = 1 ;
		while(count <= 100){
			System.out.println("Downloading files "+count);
			count++;
		}
	}
}
class SecondThread extends Thread{
	@Override
	public void run(){
		int count = 1 ;
		while(count <= 100){
			System.out.println("Downloading movies "+count);
			count++;
		}
	}
}
public class MainThread {
	public static void main(String []args){
		FirstThread firstThread = new FirstThread();
		SecondThread secondThread = new SecondThread();
		firstThread.start();
		secondThread.start();
		try{
			firstThread.join();
			secondThread.join();
		
			Thread.sleep(200);
		}catch(Exception e){
			System.out.println(e);
		}
		System.exit(0);
	}
}