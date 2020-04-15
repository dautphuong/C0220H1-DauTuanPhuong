package BaiTap;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "Blue";
    }

    public void tostring() {
        System.out.println("Color: " + this.color);
        System.out.println("Radius: " + this.radius);
        if (on) {
            System.out.println("Speed: " + this.speed);
            System.out.println("fan is on");
        } else {
            System.out.println("fan is off");
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.speed = FAST;
        fan1.radius = 10;
        fan1.color = "yellow";
        fan1.on = true;
        fan2.speed = MEDIUM;
        fan2.radius = 5;
        fan2.color = "blue";
        fan2.on = false;
        System.out.println("---Fan1---");
        fan1.tostring();
        System.out.println("---Fan2---");
        fan2.tostring();
    }
}
