
class EvenThread extends Thread{
	@Override
	public void run(){
		try{
			for(int i = 1 ; i <= 10 ;  i++){
				if(i%2 == 0){
					Thread.sleep(200);
					System.out.println("EvenThread " + i);
				}
			}
		}
		catch(InterruptedException e){
		}
	}
}

class OddThread extends Thread{
	@Override
	public void run(){
		try{
			for(int i = 1 ; i <= 10 ; i++){
				Thread.sleep(90);
				if(i%2 != 0){
					System.out.println("OddThread " + i);
				}
			}
		}
		catch(InterruptedException e){
		}
	}
}	
public class EvenThreadOddThread{
	public static void main(String[] args){
		try{
			EvenThread evenThread = new EvenThread();
			evenThread.start();
			Thread.sleep(100);
			OddThread oddThread = new OddThread();
			oddThread.start();
		}
		catch(InterruptedException e){
		}
	}
}