package java8;

@FunctionalInterface
public interface Shape {
    void calculateArea(int radius);
}

class ShapeImpl{
    public static void main(String[] args) {
        Shape circleArea = (radius) -> {
            Double area = 2 * 3.14 *radius *radius;
            System.out.println("Area of  circle "+area);
        };
        circleArea.calculateArea(5);
    }
}