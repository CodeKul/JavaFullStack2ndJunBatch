package inheritance;

/**
 * Multilevel Inheritance
 */
public class Animal {
    void eat() {
        System.out.println("Animals can eat anything");
    }
}

class Dog extends Animal {
    void run() {
        System.out.println("Dog runs anywhere");
    }
}

class BabyDog extends Dog {
    void sleep() {
        System.out.println("Only Sleep @ night");
    }
}

class AnimalImpl {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.sleep();
        babyDog.run();
        babyDog.eat();
    }
}