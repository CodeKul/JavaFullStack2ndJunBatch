package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
      //  List<String> fruits  = new LinkedList<>();
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Pineapple");
        fruits.add("Grapes");
        System.out.println(fruits);
        fruits.addFirst("Banana");
        System.out.println(fruits);
        fruits.addLast("Chikoo");
        System.out.println(fruits);
        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
       Iterator descIterator = fruits.descendingIterator();
        while (descIterator.hasNext()){
            System.out.print(descIterator.next()+" ");
        }
        System.out.println(fruits.offer("Watermelon"));
        System.out.println(fruits);
        System.out.println(fruits.peek());
        System.out.println(fruits.peekFirst());
        System.out.println(fruits.peekLast());
    }
}
