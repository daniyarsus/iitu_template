package week5;

public class Task64 {
}

interface Movable2 {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint2 implements Movable2 {
    int x, y;
    int xSpeed, ySpeed;

    public MovablePoint2(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}

class MovableCircle2 implements Movable2 {
    private final int radius;
    private final MovablePoint2 center;

    MovableCircle2(int radius, MovablePoint2 center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    @Override
    public String toString() {
        return "(" + center.x + ", " + center.y + ")";
    }
}
