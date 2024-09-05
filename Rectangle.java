public class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the area method
    @Override
    public double area() {
        return length * width;
    }

    // Implement the perimeter method
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
