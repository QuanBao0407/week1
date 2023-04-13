public class Shape {
    public String color;
    public boolean filled;

    public Shape() {
        color="green";
        filled=true;
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
    public String toString(){
        return"A Shape with color of "+getColor()+ " and  "+(isFilled()?"filled":"not filled");

    }
}
class Circle extends Shape{
    public double radius;

    public Circle() {
        super();
        radius=1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(double radius){
        double area=radius*radius*3.14;
        return area;
    }
    public double getPerimeter(double radius){
        double perimeter=radius*2*3.14;
        return perimeter;
    }
    public String toString(){
       return "A Circle with radius = "+getRadius()+" which is a subclass of "+super.toString();
    }
}
class Rectangle extends Shape{
    public double width;
    public double length;

    public Rectangle() {
        super();
        width=1.0;
        length=1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
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
    public double getArea(double width,double height){
        double area=width*height;
        return area;
    }
    public double getPerimeter(double width,double height){
        double perimeter=width*2+height*2;
        return perimeter;
    }
    public String toString(){
        return "A Rectangle with width="+getWidth()+" and length= "+getLength()
                +" which is a subclass of "+super.toString();
    }
}
class Square extends Rectangle{
    public Square() {
    }
    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double width) {
        setSide(width);
    }


    public void setLength(double length) {
        setSide(length);
    }


    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
