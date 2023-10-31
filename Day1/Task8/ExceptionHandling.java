

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int number1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int number2 = sc.nextInt();
            System.out.println("Sum of two numbers: "+addition(number1,number2));
            System.out.println("Difference of two numbers: "+subtraction(number1 , number2));
            System.out.println("Product of two numbers: "+multiplication(number1,number2));
            System.out.println("Division of two numbers: "+division(number1,number2));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input please enter valid number");
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
    public static int addition(int number1,int number2){
        return number1 + number2;
    }
    public static int subtraction(int number1 , int number2){
        return number1 - number2;
    }
    public static int multiplication(int number1 , int number2){
        return number1 * number2;
    }
    public static  int division(int number1 ,int number2){
        if(number2 == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return number1 / number2;
    }
}
