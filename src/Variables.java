/**
 * 3 Types of Variables
 * 1. local - scope of local variables are within function only
 * 2. instance - within a class but outside the method
 * 3. static - within a class but outside the method,cannot be local
 */

public class Variables {
    int z = 30; //instance variable
    static int c = 50; //static variable
    public static void main(String args[]){
        int a = 10;//local variables
         a = 20;
        System.out.println(a+c);

    }
    void display(){
        int a= 20;//local variables
        System.out.println(a+c+z);
    }
}
