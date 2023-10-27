//package Day1.Task7;

import java.util.*;

public class CommonElements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of first array: ");
		int size1 = sc.nextInt();
		System.out.print("Enter the size of second array: ");
		int size2 = sc.nextInt();
		int[] array1 = new int[size1];
		int[] array2 = new int[size2];
		System.out.println("Enter first array elements: ");
		for(int i=0; i<size1 ; i++){
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter second array elements: ");
		for(int i=0 ; i<size2 ; i++){
			array2[i] = sc.nextInt();
		}
		System.out.println("sum of the squares of those common elements :" + squareOfCommonElemets(array1,array2));
	}
	public static int squareOfCommonElemets(int[] array1,int[] array2){
		int sum = 0;
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for(Integer num : array1){
			set1.add(num);
		}
		for(Integer num : array2){
			set2.add(num);
		}
		set1.retainAll(set2);
		for(Integer num : set1){
			sum+=num;
		}
		return sum;
	}
}