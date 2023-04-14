public class Point {
    public float y;
    public float x;

    public Point(float y, float x) {
        this.y = y;
        this.x = x;
    }

    public Point() {
        y=0;
        x=0;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        return new float[]{x,y};
    }
    public String toString(){
        return "x:"+x+"y: "+y;
    }
}
class MovablePoint{
    public float x;
    public float y;
    public float ySpeed;
    public float xSpeed;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float ySpeed, float xSpeed) {
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

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

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(float xSpeed, float ySpeed){
        return new float[]{this.xSpeed, this.ySpeed};
    }
public String toString(){
        return x+"  "+y+"   "+getSpeed(xSpeed,ySpeed);
}
public MovablePoint move (){
        x+=xSpeed;
        y+=ySpeed;
        return move();
}
}
