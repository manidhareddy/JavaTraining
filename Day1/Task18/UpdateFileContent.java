import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class UpdateFileContent{
	static String directory;
	public static void main(String[] args){
		//input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the file path: ");
		String filePath = sc.nextLine();
		
		filePath = filePath.replace("\\","/");
		int index = filePath.lastIndexOf("/");
		directory = filePath.substring(0,index);
		String fileName = filePath.substring(index);
		
		displayContent(fileName);
		
		System.out.println("Enter content to the file : ");
		String content = sc.nextLine();
		
		appendToTextFile(fileName , content);
		displayContent(fileName);
		
	}
	public static void appendToTextFile(String fileName , String content){
		File file = new File(directory +"/" + fileName);
		try(FileWriter fileWriter = new FileWriter(file,true) ;
		BufferedWriter bufferWriter = new BufferedWriter(fileWriter)){
			bufferWriter.append("\n"+content);
			bufferWriter.flush();
		}
		catch(IOException e){
			System.out.println("append operation on file is unsuccessful :(");
		}
	}
	public static void displayContent(String fileName){
		File file = new File(directory + "/" + fileName);
		try(FileReader fileReader = new FileReader(file);
		BufferedReader bufferReader = new BufferedReader(fileReader)){
			System.out.println("Content in the file: ");
			System.out.println("---------------------");
			String str;
			while((str = bufferReader.readLine())!=null){
				System.out.println(str);
			}
			System.out.println("---------------------");
		}
		catch(IOException e){
			System.out.println("Enable to read the file");
		}
	}
}