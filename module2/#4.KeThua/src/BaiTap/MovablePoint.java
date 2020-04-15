package BaiTap;
class Point{
    private float x;
    private float y;
    Point(){}

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    Point(float x, float y){
        this.x=x;
        this.y=y;
    }

}
public class MovablePoint extends Point {

}
