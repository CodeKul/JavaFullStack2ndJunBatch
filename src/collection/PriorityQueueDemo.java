package collection;

import java.util.PriorityQueue;

//Pending
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(11);
        queue.add(10);
        queue.add(7);
        queue.add(6);
        queue.add(2);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

    }
}
