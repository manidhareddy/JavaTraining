package Day1.Task2;
import java.util.Scanner;
public class CountDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentance = scanner.nextLine();
        countDuplicates(sentance);
    }
    static void countDuplicates(String sentance){
        String sentance1 = sentance;
        for(int index = 0 ; index<sentance1.length() ; index++){
            char character = sentance1.charAt(index);
            int count = 1;//initially count set to 1 for every character
            if(character != ' ') {
                for (int pointer = index + 1; pointer < sentance1.length(); pointer++) {
                    if (character == sentance1.charAt(pointer)) {
                        count++;
                        sentance1 = sentance1.substring(0, pointer) + sentance1.substring(pointer + 1);
                    }
                }
                if (count > 1) {
                    System.out.println("Char: " + character + ", Count: " + count + "times");
                }
            }
        }

    }
}
