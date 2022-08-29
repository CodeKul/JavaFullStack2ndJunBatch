package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
       // Deque<String> cities = new LinkedList<>();
        Deque<String> cities = new ArrayDeque<>();
        cities.addFirst("Pune");
        cities.addFirst("Mumbai");
        cities.offerFirst("Ooty");
        cities.offerLast("Nagpur");
        cities.addLast("Kolkata");
        System.out.println(cities);
        System.out.println(cities.peekFirst());
        System.out.println(cities.peekLast());
        System.out.println(cities.poll());
        System.out.println(cities);

    }
}
