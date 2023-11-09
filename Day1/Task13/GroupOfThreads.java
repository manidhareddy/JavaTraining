class Thread1 extends Thread{
	public Thread1(ThreadGroup tg , String tname){
		super(tg,tname);
	}
	@Override
	public void run(){
		for(int i = 0 ; i < 10; i++){
			System.out.println("Working on Task13 ");
		}
	}
	@Override
	public String toString(){
		return "Details of current Thread\n"+"Thread Name: "+this.getName()+"\nThreadGroup :"+this.getThreadGroup().getName();
	}
}
class Thread2 extends Thread{
	public Thread2(ThreadGroup tg , String tname){
		super(tg,tname);
	}
	@Override
	public void run(){
		//try { this.sleep(10); } catch(InterruptedException e){}
		for(int i = 0 ; i < 10; i++){
			System.out.println("Playing Games ");
		}
	}
	@Override
	public String toString(){
		return "Details of current Thread\n"+"Thread Name: "+this.getName()+"\nThreadGroup :"+this.getThreadGroup().getName();
	}		
}

public class GroupOfThreads{
	
	public static void main(String[] args){
		ThreadGroup threadGroup = new ThreadGroup("FreshersGroup");
		Thread1 user1 = new Thread1(threadGroup,"mani");
		Thread2 user2 = new Thread2(threadGroup,"naga");
		user1.start();
		user2.start();
		System.out.println(user1);
		System.out.println(user2);
		
		
	}
}