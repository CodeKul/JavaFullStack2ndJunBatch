package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> country = new HashSet<>();
        Set<String> states = new HashSet<>();
        country.add("India");
        country.add("Australia");
        country.add("Nepal");
        country.add("China");
        country.add("India");
        country.add(null);
        country.add(null);
        System.out.println(country);

        states.add("Maharashtra");
        states.add("AP");
        states.add("Kerala");
        states.add("India");
        country.addAll(states); //union
        System.out.println(country);

        country.retainAll(states); //intersection
        System.out.println(country);
        country.containsAll(states);
        System.out.println(country);
    }
}
