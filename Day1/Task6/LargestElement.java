package Day1.Task6;


import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take size input
        System.out.println("Enter the size of the list");
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>(size);
        //input list elements
        System.out.println("Enter elements of list: ");
        for(int i = 0 ; i < size ; i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter the position of largest element: ");
        int kth = sc.nextInt();
        System.out.println(kth + " largest element in the array is "+ kthLargestNumber(list,kth));
    }
    public static int kthLargestNumber(List<Integer> list,int kth){
        Collections.sort(list);
        return list.get(list.size()-kth);
    }
}
