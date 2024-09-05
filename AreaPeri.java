public class AreaPeri
{
    public static void main(String[] args) {
        // Test case for Rectangle
        Shape rectangle = new Rectangle(5, 7);
        System.out.println("Rectangle Area: " + rectangle.area()); // Expected Output: 35.0
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter()); // Expected Output: 24.0

        // Test case for Circle
        Shape circle = new Circle(3.5);
        System.out.println("Circle Area: " + circle.area()); // Expected Output: 38.48451
        System.out.println("Circle Perimeter: " + circle.perimeter()); // Expected Output: 21.9911
    }
}
