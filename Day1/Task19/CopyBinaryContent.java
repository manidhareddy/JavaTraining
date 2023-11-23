import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class CopyBinaryContent{
	public static void main(String []args){
		File fileIn = new File("D:\\c\\Area_rectangle.exe");
		File fileOut = new File("D:\\BinaryData.bin");
		try(BufferedInputStream bufferStreamIn = new BufferedInputStream(new FileInputStream(fileIn));
		BufferedOutputStream bufferStreamOut = new BufferedOutputStream(new FileOutputStream(fileOut))){
			//1024 byte = 1kb
			byte[] binaryBites = new byte[8];
			int size;
			
			while((size = bufferStreamIn.read(binaryBites))!=-1){
				System.out.println("writting data... ");
				System.out.println(Arrays.toString(binaryBites));
				bufferStreamOut.write(binaryBites);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}