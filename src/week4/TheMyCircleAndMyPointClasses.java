package week4;

public class TheMyCircleAndMyPointClasses {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println(c1);

        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);
        System.out.println("Base area is: " + cy1.getBaseArea());
        System.out.println("Volume is: " + cy1.getVolume());

        Cylinder cy2 = new Cylinder(2.0, 10.0);
        System.out.println(cy2);
        System.out.println("Base area is: " + cy2.getBaseArea());
        System.out.println("Volume is: " + cy2.getVolume());

        Cylinder cy3 = new Cylinder(2.0, 10.0, "yellow");
        System.out.println(cy3);
        System.out.println("Base area is: " + cy3.getBaseArea());
        System.out.println("Volume is: " + cy3.getVolume());
    }
}

class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}

class Cylinder {
    private final Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
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

    public double getBaseArea() {
        return base.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ",height=" + height + "]";
    }
}
