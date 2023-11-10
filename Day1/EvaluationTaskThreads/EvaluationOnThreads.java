import java.util.*;

class Message{
	Queue<String> messageQueue = new LinkedList<>();
	public synchronized void readingMessages(){
		if(messageQueue.size() == 0){
			try{
				System.out.println("waiting for message from sender");
				wait();//waitting for message to add
				
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
		String message = messageQueue.poll();
		System.out.println(message);
		
		
	}
	public synchronized void writingMessage(String message){
		messageQueue.add(message);
		System.out.println("Added a new message");
		notify();//notify other threads
	}
	
}
class Sender extends Thread{
	Message message;
	public Sender(Message message){
		this.message = message;
		
	}
	@Override
	public void run(){
		for(int i = 1 ; i <=5 ; i++){
			try { this.sleep(100); } catch(InterruptedException e){}
		message.writingMessage(" Package "+i);
		}
	}
		
}
class Receiver extends Thread{
	Message message;
	public Receiver(Message message){
		this.message = message;
		
	}
	@Override
	public void run(){
		try { this.sleep(100); } catch(InterruptedException e){}
		for(int i = 1 ; i<=5 ; i++){
			message.readingMessages();
		}
	}
}
public class EvaluationOnThreads{
	public static void main(String[] args){
		Message msg = new Message();
		Sender send = new Sender(msg);
		Receiver recever = new Receiver(msg);
		
		recever.start();
		send.start();
		
		
	}
}