import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingCSVFile{
	public static void main(String[] args){
		try{
		BufferedReader reader = new BufferedReader(new FileReader("HitList.csv"));
		String info = reader.readLine();//pointed to first line
		while( info!= null){
		System.out.println(info);
		info = reader.readLine();//set cursor to next line in csv file
		}
		//System.out.println("may be");
		reader.close();
		}
		catch(IOException e){
			System.out.println(e);//cannot find spicifed file
		}
		
	}
}