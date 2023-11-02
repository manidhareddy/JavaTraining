import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class ReadingJSONFile{
	public static void main(String[] args){
		try{
		BufferedReader reader = new BufferedReader(new FileReader("Details.json"));
		String info = reader.readLine();
		System.out.println(info);
		info = info.substring(1,info.length()-1);//remove curly brackets{}
		String[] jsonArray = info.split(",");
		//iterating through json key:values
		for(String keyValue : jsonArray){
			String[] jsonKeyValue = keyValue.split(":");
			System.out.println(jsonKeyValue[0] +" : "+jsonKeyValue[1]);
		}
		reader.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
}