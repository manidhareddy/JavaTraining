class RunningApplications extends Thread{
	
	@Override
	public void run(){
		for(int i = 0 ; i <= 10 ; i++){
			try { Thread.sleep(200); } catch(InterruptedException e){}
			System.out.println("Application is running in background");
		}
		System.out.println("Application X");
	}
}
public class AliveThreadDemo{
	public static void main(String args[]){
		RunningApplications app = new RunningApplications();
		app.start();
		try { 
			Thread.sleep(1000);  
			if(app.isAlive()){
				System.out.println("Application Thread is still Alive");
				app.join();
			}
		}catch(InterruptedException e){}
		
			if(app.isAlive()){
				System.out.println("Application thread is still alive");
			}
			else{
				System.out.println("Application thread is not alive");
			}
		
		System.out.println("Shut down ...");
		System.exit(0);
		
	}
}