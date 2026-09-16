class Shape {
    void area() {
        System.out.println("Area not defined for generic shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Circle area: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println("Rectangle area: " + (length * width));
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5.0);
        s.area();

        s = new Rectangle(4.0, 6.0);
        s.area();

        s = new Shape();
        s.area();
    }
}