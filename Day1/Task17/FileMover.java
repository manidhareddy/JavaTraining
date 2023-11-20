import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FileMover{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source file path : ");
		String sourcePath = sc.nextLine().replace("\\","/");
		System.out.println("Enter the destination directory path : ");
		String destinationPath = sc.nextLine();
		File sourceFile = new File(sourcePath);
		File destinationFile = new File(destinationPath);
		try{
			if(!sourceFile.isFile()){
				throw new Exception("please enter a valid file name");
			}
			/*if(!destinationFile.isDirectory()){
				throw new Exception("please entera a valid destination directory path");
			}*/
			sourceFile.renameTo(destinationFile);
		}
		catch(Exception e){
			System.out.println(e);
		}
		//catch(IOException e){
		//	System.out.println(e);
		//}
	}
}