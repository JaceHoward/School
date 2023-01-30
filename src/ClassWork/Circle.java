package ClassWork;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Radius: " + radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
    }
}