package java8;

import java.util.*;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        //list
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.forEach(n -> System.out.println(n));
        ConsumerImpl ci = new ConsumerImpl();
        for (Integer n :numbers)
            ci.accept(n);

        //map
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Pune");
        map.put(2,"Mumbai");
        map.put(3,"Delhi");
        map.forEach((k,v) -> {
            System.out.println("Key " + k + " Value " + v);
        });
    }
}

class ConsumerImpl implements Consumer<Integer>{
    @Override
    public void accept(Integer n) {
        System.out.println(n);
    }
}