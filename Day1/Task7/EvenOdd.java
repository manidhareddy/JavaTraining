//package Day1.Task7;

import java.util.*;

public class EvenOdd {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter array elements");
		for(int i = 0 ; i<size ; i++){
			array[i] = sc.nextInt();
		}
		doubleEvenTripleOdd(array);
		System.out.println(Arrays.toString(array));
	}
	public static void doubleEvenTripleOdd(int[] array){
		for(int i = 0 ; i<array.length ; i++){
			if(array[i]%2 == 0){
				array[i] *= 2;
			}
			else{
				array[i] *= 3;
			}
		}
	}
}