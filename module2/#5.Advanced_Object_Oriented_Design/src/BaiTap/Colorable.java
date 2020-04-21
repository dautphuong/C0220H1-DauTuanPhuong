package BaiTap;

public class Colorable {
    //Colorable
    public interface Color {
        void howToColor();
    }

    //Shape
    static class Shape {
        private String color = "green";
        private boolean filled = true;

        public Shape() {
        }

        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        @Override
        public String toString() {
            return "A Shape with color of "
                    + getColor()
                    + " and "
                    + (isFilled() ? "filled" : "not filled");
        }
    }

    static class Circle extends Shape {
        private double radius = 1.0;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }


        @Override
        public String toString() {
            return "A Circle with radius="
                    + getRadius() + "and Area: " + getArea()
                    + ", which is a subclass of "
                    + super.toString();
        }
    }

    static class Rectangle extends Shape {
        private double width = 1.0;
        private double length = 1.0;

        public Rectangle() {
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getArea() {
            return width * this.length;
        }

        public double getPerimeter() {
            return 2 * (width + this.length);
        }


        @Override
        public String toString() {
            return "A Rectangle with width="
                    + getWidth()
                    + " and length="
                    + getLength() + "and Area: " + getArea()
                    + ", which is a subclass of "
                    + super.toString();
        }
    }

    static class Square extends Shape implements Color {
        private double side;

        public Square() {
        }

        public Square(double side) {
            this.side = side;
        }

        public Square(double side, String color, boolean filled) {
            super(color, filled);
            this.side = side;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        double getArea() {
            return side * side;
        }

        @Override
        public void howToColor() {
            System.out.println("Color all four sides.");
        }

        @Override
        public String toString() {
            return "A Square with side="
                    + getSide() + "and Area: " + getArea()
                    + ", which is a subclass of "
                    + super.toString();
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Square[3];
        shapes[0] = new Circle(3, "yellow", false);
        shapes[1] = new Rectangle(3, 3, "infinity", true);
        shapes[2] = new Square(3, "melinda", true);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            if (shapes[i] instanceof Square) {
                Color color = (Square) shapes[i];
                color.howToColor();
            }
        }
    }
}
