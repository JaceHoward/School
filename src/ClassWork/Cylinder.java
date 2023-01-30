package ClassWork;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public String toString() {
        return "Base Radius: " + base.radius + " Height: " + height;
    }

    public static void main(String[] args) {
        Circle base = new Circle(4);
        Cylinder cylinder = new Cylinder(base, 10);
        System.out.println(cylinder.toString());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
