

public class ThrowAndThrowsDemo{
	public static void throwDemo(){
		try{
			throw new NullPointerException("Throw Demo");
		}catch (NullPointerException e){
			System.out.println("Catch inside throwDemo");
			throw e; // rethrow the exception
		}
	}
	public static void throwsDemo() throws IllegalAccessException {
		System.out.println("Inside throwsDemo");
		throw new IllegalAccessException("throws demo");
	}
	public static void main(String[] args){
		try{
			throwDemo();
		}catch (NullPointerException e){
			System.out.println("Recatch: " + e);
		}
		 try{
			 throwsDemo();
		 }catch(IllegalAccessException e){
			 System.out.println("Caught "+e);
		 }
	}
}