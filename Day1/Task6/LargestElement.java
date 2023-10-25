package Day1.Task6;


import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take size input
        System.out.println("Enter the size of the list");
        int size = sc.nextInt();
        int[] array = new int[size];
        //input list elements
        System.out.println("Enter elements of list: ");
        for(int i = 0 ; i < size ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the position of largest element: ");
        int kth = sc.nextInt();
        System.out.println(kth + " largest element in the array is "+ kthLargestNumber(array,kth));
    }
    public static int kthLargestNumber(int[] array,int kth){
        Arrays.sort(array);
        return array[array.length-kth];
    }
}
