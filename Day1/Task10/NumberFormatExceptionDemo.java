import java.util.Scanner;

public class NumberFormatExceptionDemo{
	public static void main(String[] args){
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String stringNumber = sc.next();
		int number = Integer.parseInt(stringNumber);
		}
		catch(NumberFormatException e){
			System.out.println("Enter a valid number");
			System.out.println(e);
		}
	}
}