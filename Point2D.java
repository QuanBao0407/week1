public class Point2D {
    public float x;
    public float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        x=0;
        y=0;
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
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        return new float[]{x,y};
    }
    public String toString(){
        return x+""+y;
    }
}
class Point3D extends Point2D{
    public float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(){
        z=0;
    }

    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{x,y,z};
    }
    public void setXYZ(){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public String toString(){
        return x+""+y+""+z;
    }
}
