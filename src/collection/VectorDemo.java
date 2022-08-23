package collection;

import java.util.List;
import java.util.Vector;

/**
 * methods from vector class are synchronised
 * thread safe
 */
public class VectorDemo {
    public static void main(String[] args) {
      //  List<Integer> list = new Vector<>();
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(5);
        vector.add(3);
        vector.add(6);
        vector.add(20);
        System.out.println(vector);
    }
}
