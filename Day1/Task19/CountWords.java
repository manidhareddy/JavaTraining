import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWords{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a file path: ");
		String path = sc.nextLine();
		File file = new File(path);
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			int count = 0;
			String line;
			while((line = br.readLine())!=null){
				count += line.split(" ").length;
			}
			System.out.println("The given text file contains "+ count +" words");
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}