import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElements{
	public static void main(String[] args){
		List<Integer> list1 = List.of(23,73,45,12,34,64,89);
		List<Integer> list2 = List.of(73,23,25,56,45,89,12);
		List<Integer> list3 = list1.stream().filter(word1 -> list2.contains(word1)).collect(Collectors.toList());
		System.out.println("List1 = "+list1);
		System.out.println("List2 = "+list2);
		System.out.println("Common elements in both lists = "+list3);
		
	}
}