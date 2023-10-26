//package Day1.Task7;

import java.util.*;

public class CaseInsensitiveHashMap{
	public static void main(String[] args){
		HashMap<String,Integer> map1 = new HashMap<>();
		map1.put("a",1);
		map1.put("b",2);
		map1.put("c",3);
		HashMap<String,Integer> map2 = new HashMap<>();
		map2.put("d",4);
		map2.put("a",1);
		map2.put("e",5);
		
		map1.putAll(map2);//merge two HashMaps;
		System.out.println(map1);
		String target = "A";
		System.out.println(search(map1,target));
	}
	public static int search(HashMap<String,Integer> map,String key){
		for(Map.Entry<String,Integer> map1 : map.entrySet()){
			if(map1.getKey().equalsIgnoreCase(key)){
				return map1.getValue();
			}
		}
		return -1;
	}
}