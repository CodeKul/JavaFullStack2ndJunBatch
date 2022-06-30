package abstraction;

public abstract class Shape {
    abstract double calculateArea();
    void display(){
        System.out.println("Calculating area of diff. Shape");
    }
}
class Rectangle extends Shape{
    int breath;
    int height;

    public Rectangle(int breath, int height) {
        this.breath = breath;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return breath*height;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Area of Rect. "+calculateArea());
    }
}
class ShapeImpl{
    public static void main(String[] args) {
        Shape shape = new Rectangle(5,7);
        shape.display();
    }
}