/**
 * Variables - container which holds value when the program gets executed
 * name of memory location
 * <p>
 * Types :
 * 1. local variable - declared inside the body of the methods
 * we can use this variable only within that method
 * & other methods are not aware that variable
 * cannot be defined local variable with static keyword
 * <p>
 * 2. instance variable - declared inside the class but outside the method body
 * not declared as static
 * 3. static variable - declared inside the class with static keyword
 * cannot be local
 * create a single copy of a static variable & share to all instances
 * of class
 * memory allocation happens only once when the class is loaded in the
 * memory
 */
public class Variables {
    int z = 30; //instance variable
    static int c = 50; //static variable

    public static void main(String args[]) {
        int a = 10;//local variables
        a = 20;
        System.out.println(a + c);

    }

    void display() {
        int a = 20;//local variables
        System.out.println(a + c + z);
    }
}
