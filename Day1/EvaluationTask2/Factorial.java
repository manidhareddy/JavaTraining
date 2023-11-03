import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidNumberException extends Exception{
	public InvalidNumberException(String message){
		super(message);
	}
}
public class Factorial{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			int answer = factorial(number);
			if(number < 0){ //if given number is negative then it throw an exception
				throw new InvalidNumberException("Negative numbers are not allowed");
			}
			if(answer < -1){
				throw new ArithmeticException("Factorial of given number is greater than Integer max value");
			}
			System.out.println("Factorial of given number is "+answer);
		}
		catch(InvalidNumberException e){
			System.out.println(e);
		}
		catch (ArithmeticException e){
			System.out.println(e);
		}
		catch(InputMismatchException e){
			System.out.println("please enter a valid number");
		}
		
		
	}
	private static int factorial(int number) throws InvalidNumberException{
		if(number < 0){
			throw new InvalidNumberException("Negative numbers are not allowed");
		}
		if(number == 0){
			return 1;
		}
		return number * factorial(number - 1);
	}
}