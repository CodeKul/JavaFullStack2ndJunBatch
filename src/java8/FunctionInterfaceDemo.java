package java8;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = a -> a*2;//20
        f1 = f1.andThen(a -> a*5);
        Integer result = f1.apply(10);
        System.out.println("Result: "+result);


        Function<Integer,Integer> f2 = a -> a * 5;

        System.out.println(f2.apply(15));
    }
}
