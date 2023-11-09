class Thread1 extends Thread{
	@Override
	public void run(){
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println("Thread1 will Execute first");
		}
		System.out.println("Priority of firstThread "+ super.getPriority());
	}
}
class Thread2 extends Thread {
	@Override
	public void run(){
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println("Thread2 will Execute second") ;
		}
		System.out.println("Priority of secondThread "+super.getPriority());
	}
}
class Thread3 extends Thread{
	@Override
	public void run(){
		for(int i = 1 ; i<= 10 ; i++){
			System.out.println("Thread3 will Execute Third");
		}
		System.out.println("Priority of thirdThread "+super.getPriority());
	}
}
public class PriorityExample{
	public static void main(String[] args){
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		Thread3 th3 = new Thread3();
		
		//setting threads priority
		th1.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(5);
		th3.setPriority(Thread.MIN_PRIORITY);
		
		//start threads
		th1.start();
		th2.start();
		th3.start();
	}
}