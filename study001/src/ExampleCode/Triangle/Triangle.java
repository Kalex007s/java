package ExampleCode.Triangle;

public class Triangle implements Shape {
    private double length;
    private double height;

    public Triangle() {
    }

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return length * height * 1/2;
    }

    @Override
    public double calculatePerimeter() {
        return length*3;
    }
}
