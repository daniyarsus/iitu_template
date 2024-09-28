package week4;

public class TheMyLineAndMyPoint {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(1, 2, 3);
        System.out.println(c1);

        MyCircle c2 = new MyCircle(new MyPoint(5, 6), 7);
        System.out.println(c2);

        c1.setRadius(5);
        System.out.println("Radius is: " + c1.getRadius()); // 5

        c1.setCenterXY(3, 3);
        System.out.println("Center is: " + c1.getCenter());
        System.out.println("Center X is: " + c1.getCenterX());
        System.out.println("Center Y is: " + c1.getCenterY());

        System.out.printf("Area is: %.2f%n", c1.getArea());
        System.out.printf("Circumference is: %.2f%n", c1.getCircumference());

        System.out.printf("Distance is: %.2f%n", c1.distance(c2));
    }
}

class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.getCenter());
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center.toString() + "]";
    }
}
