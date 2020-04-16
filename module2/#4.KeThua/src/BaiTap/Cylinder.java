package BaiTap;

class Circle {
    private double r;
    private String color;

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double acreage() {
        return this.r * this.r * 3.14;
    }

    @Override
    public String toString() {
        return "A Circle with color of " + getColor() + " and radius " + getR();
    }
}

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(int r, String color, int height) {
        super(r, color);
        this.height = height;
    }

    @Override
    public String toString() {
        return "A Cylender height " + getHeight() + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        //Circle
        Circle circle = new Circle(3, "red");
        System.out.println(circle);
        //Cylinder
        Cylinder cylinder = new Cylinder(4, "blue", 5);
        System.out.println(cylinder);
    }
}
