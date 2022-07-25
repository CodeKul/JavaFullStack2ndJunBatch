package exceptionhandling;

import java.io.IOException;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String n = "101AQQQQQ";
        int i = Integer.parseInt(n);
        System.out.println(i+5);
    }
}
