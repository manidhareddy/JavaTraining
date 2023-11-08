class Files {
	int pointer = -1;
	String[] files = new String[5];
	synchronized public void addFile(String name){
		++pointer;
		files[pointer] = name;
	}
	synchronized public void deleteFile(){
		pointer--;
	}
	synchronized public void displayFiles(){
		for(int i = 0 ; i<=pointer ;i++){
			System.out.print(files[i] +" , ");
		}
		System.out.println();
	}
}
class Users extends Thread{
	static Files doc = new Files();
	@Override
	public void run(){
		doc.addFile("java");
		doc.addFile("oops");
		doc.displayFiles();
		
	}
	
}
public class SharedResources{
	public static void main(String[] args){
		Users user1 = new Users();
		Users user2 = new Users();
		user1.start();
		user2.start();
	}
}