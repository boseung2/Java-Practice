abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

class Circle extends Shape {
    double r;

    public Circle() {

    }

    public Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    @Override
    double calcArea() {
        return 0;
    }

}

class Rectangle extends Shape {

    @Override
    double calcArea() {
        return 0;
    }

}