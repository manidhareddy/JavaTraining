
import java.util.List;
import java.util.stream.Collectors;


public class ConvertToUppercase {
    public static void main(String[] args) {
        List<String> stringList = List.of("Chicony" , "Acer" ,  "Lenovo" ,"Macbook" , "Asus" , "Hp");
		System.out.println(stringList);
		stringList = stringList.stream().map(word -> !word.startsWith("A") ? word.toUpperCase() : word).collect(Collectors.toList());
		System.out.println(stringList);
        
    }
}
