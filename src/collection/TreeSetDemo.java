package collection;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(87);
        numbers.add(84);
        numbers.add(52);
        numbers.add(100);
        numbers.add(5);
        numbers.add(25);
        numbers.add(46);
        numbers.add(100);
        System.out.println(numbers);
        System.out.println(numbers.ceiling(97));
        System.out.println(numbers.floor(97));
    }
}
