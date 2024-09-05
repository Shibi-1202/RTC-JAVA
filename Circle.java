public class Circle implements Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the area method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Implement the perimeter method
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
