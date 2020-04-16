package BaiTap;

class Shape {
    private String color = "red";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor();
    }
}

public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle(float side1, float side2, float side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double h = Math.sqrt(side1 * side1 - side2 * side2 / 4);
        return side2 * h / 2;
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public String toString() {
        return "Triangle Area:" + getArea() + "and Perimeter:" + getPerimeter() + ", " + super.toString();
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Triangle triangle = new Triangle(3, 4, 5, "blue");
        System.out.println(triangle);
    }
}
