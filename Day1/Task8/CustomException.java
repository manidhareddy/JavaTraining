

import java.util.Scanner;

class InvalidUsernameException extends Exception{
    //custom exception
    public InvalidUsernameException(String message){
        super(message);
    }

}
public class CustomException {
    public static void main(String[] args) throws InvalidUsernameException {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            String special  = "[@_!#$%^&*()<>?}{~:]";
            for(int i=0;i<name.length();i++){
                if(special.indexOf(name.charAt(i)) >= 0){
                    throw new InvalidUsernameException("Your name is in valid ");
                }
            }
            System.out.println("your name is valid");

    }
}
