import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile{
	public static void main(String[] args){
		//input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source file path : ");
		String sourceFile = sc.nextLine();
		sourceFile = sourceFile.replace("\\","/");
		System.out.println("Enter destination file Path: ");
		String destinationFile = sc.nextLine();
		destinationFile = destinationFile.replace("\\","/");
		
		
		try(BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))){
			int pointer;
			while( (pointer=reader.read()) != -1){
				writer.write(pointer);
			}
			System.out.println("File copy done :)");
		}
		catch(IOException e){
			System.out.println("some thing went wrong :(");
			//System.out.println(e);
		}
		
	}
}