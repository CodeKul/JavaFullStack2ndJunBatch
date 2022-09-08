package collection;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Amit");
        map.put(2,"Sneha");
        map.put(3,"Nayana");
        map.put(4,"Suraj");
        System.out.println(map);
        map.put(3,"Anuja");
        System.out.println(map);
        map.put(null,null);
        map.put(null,"Sony");
        map.put(5,null);
        map.put(6,"Sneha");
        System.out.println(map);
        System.out.println(map.get(5));
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        map.remove(5);
        System.out.println(map);
    }
}
