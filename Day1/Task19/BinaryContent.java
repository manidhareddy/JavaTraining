import java.io.*;
import java.util.*;


public class BinaryContent{
	public static void main(String[] args){
		File fileIn = new File("C:\\Users\\G.Venkat Reddy\\Desktop\\NewBinaryData.bin");
		
		try(DataInputStream dataInput = new DataInputStream(
											new BufferedInputStream(
												new FileInputStream(fileIn))))
			{
			String line;
			while((line = dataInput.readLine())!=null){
				while(line.length()>=7){
				System.out.print((char)Integer.parseInt(line.substring(0,7),2));
				line = line.substring(7);
				}
				System.out.println();
				
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}