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
    public float[] getXY() {
        float[] arr={getX(),getY()};
        return arr;
    }

    public void setXY(float[] arr) {
        setX(arr[0]);
        setY(arr[1]);
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY()+")";
    }
}
public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    MovablePoint(){}
    MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return super.toString()+",speed=("+xSpeed+","+ySpeed+")";
    }
    public MovablePoint move(){
        +=xSpeed;
    }
    public static void main(String[] args) {

    }
}
