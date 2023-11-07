class Thread1 extends Thread{
	@Override
	public void run(){
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("Thread id 101 Inside Thread1 " + i);
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run(){
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("Thread id 102 inside Thread2 " + i);
		}
	}
}

public class MultiThreadingDemo{
	public static void main(String[] args){
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		thread1.start();
		thread2.start();
		
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("Inside Main Thread " + i);
		}
	}
}