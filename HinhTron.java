public class HinhTron  {
    public double radius;
    public String color;
public double area;
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

    public double getArea() {
        return area;
    }
    public String toString(){
        return "màu sắc : "+getColor()+"bán kính : "+getRadius()+"diện tích"+getArea();
    }
}
class Cylinder extends HinhTron{
    public double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getV(double radius){
        return this.area*this.height;
    }
    public String toString(){
        return "chiều cao"+getHeight()+super.toString();
    }
}

