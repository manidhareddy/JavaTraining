package Day1.Task6;

import java.util.LinkedList;
import java.util.ListIterator;

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
       // linkedList.removeLastOccurrence("acer");
        String target = "acer";
        ListIterator<String> it = linkedList.listIterator(linkedList.size());
        while(it.hasPrevious()){
            if(it.previous().equals(target)){
                it.remove();
                break;
            }
        }
        System.out.println(linkedList);

    }
}
