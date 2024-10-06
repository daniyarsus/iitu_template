package week4;

public class TheCircleAndCylinderClassUsingComposition {
    public static void main(String[] args) {
        Cylinder2 cylinder = new Cylinder2(2.0, "red", 5.0);

        System.out.println("Color: " + cylinder.getColor());
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Area: " + cylinder.getSurfaceArea());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}

class Circle2 {
    private double radius;
    private String color;

    public Circle2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle2() {
        this.radius = 1.0;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder2 {
    private final Circle base;
    private double height;

    public Cylinder2() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder2(double radius, String color, double height) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public String getColor() {
        return base.getColor();
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }
}
