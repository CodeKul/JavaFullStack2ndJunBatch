package collection;

import java.util.List;

public class GenericsDemo<E> {
    E t;
    E getValue(E t) {
        this.t = t;
        return t;
    }

    public static void main(String[] args) {
        GenericsDemo demo = new GenericsDemo();
        System.out.println(demo.getValue(5));
        System.out.println(demo.getValue("Hi"));
        System.out.println(demo.getValue(true));
    }
}
