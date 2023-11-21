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
		filePath = filePath.replace("\\","/");
		String directory = getDirectory(filePath);
		File file = new File(filePath);
		File newFile = new File(directory +"/"+ newFileName);
		
		return file.renameTo(newFile);
	}
	public static String getDirectory(String filePath){
		int index = filePath.lastIndexOf("/");
		return filePath.substring(0,index);
	}
}