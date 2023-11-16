import java.util.*;
import java.util.stream.*;
public class SumOfSquares{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the list : ");
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<>(size);
		System.out.println("Enter the list elements :-");
		for(int i = 0 ; i < size ; i++){
			list.add(sc.nextInt());
		}
		 
		Integer sum = list.stream().filter(num -> (num%2 != 0) ).map(num -> num*num).reduce(0 , (a,b) -> a+b);
		System.out.println("Sum of squares remaining ones is : "+sum);
	}
}