import java.util.Scanner;
import java.io.File;

public class FileRename{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the file Path : ");
		String filePath = sc.nextLine();
		System.out.print("Enter the new file name: ");
		String newFileName = sc.nextLine();
		if(renameFile(filePath , newFileName)){
			System.out.println("Successful ");
		}
		else{
			System.out.println("unsuccessful");
		}
	}
	public static boolean renameFile(String filePath , String newFileName){
		File file = new File(filePath);
		String directory = file.getParent();
		File newFile = new File(directory +"/"+ newFileName);
		return file.renameTo(newFile);
	}
}