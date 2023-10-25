package Day1.Task6;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList= new LinkedList<>();
        //add string elements
        linkedList.add("acer");
        linkedList.add("asus");
        linkedList.add("mac");
        linkedList.add("hp");
        linkedList.add("acer");
        linkedList.add("dell");
        linkedList.add("asus");
        //display linked list
        System.out.println(linkedList);
        //remove last occurrence of the string
        linkedList.removeLastOccurrence("acer");
        System.out.println(linkedList);

    }
}
