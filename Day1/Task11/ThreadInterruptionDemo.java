class Application implements Runnable{
	@Override
	public void run(){
		for(int i = 0 ; i < Integer.MAX_VALUE ; i++){
			if(Thread.interrupted()){
				System.out.println("This Thread got interrupted by main thread");
				System.err.println("Try Again");
				return;
			}
			System.out.println("Downloding File compeleted .........." + i);
		}
	}
}
public class ThreadInterruptionDemo{
	public static void main(String[] args){
		try{
			Thread thread = new Thread(new Application());
			thread.setName("Downloader");
			thread.start();
			Thread.currentThread().sleep(200);
			thread.interrupt();
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
}