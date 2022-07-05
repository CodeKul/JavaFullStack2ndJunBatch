package interfacedemo;

import java.util.Scanner;

public interface Shape {
    double calculateArea();
}
class Rectangle implements Shape{
    int breadth;
    int height;
    Rectangle(int breadth,int height){
        this.height = height;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return height * breadth;
    }
}

class ShapeImpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.Rectangle\n2.Circle\n3.Square\n4.Triangle\n5.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            Shape shape;
            switch (ch){
                case 1:
                    System.out.println("Enter breadth & height");
                    int breadth = sc.nextInt();
                    int height = sc.nextInt();
                    shape = new Rectangle(breadth,height);
                    System.out.println("Area of Rectangle "+shape.calculateArea());
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }while (ch<=5);
    }
}