package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        System.out.println(numbers.remove());
        numbers.offer(60);
        System.out.println(numbers);
        System.out.println(numbers.peek());
        System.out.println(numbers.poll());
        System.out.println(numbers);
    }
}
