public class Triangle extends Shape{
    public double side1;
    public double side2;
    public double side3;


    public Triangle() {
        super();
        side1=1.0;
        side2=1.0;
        side3=1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double ChuVi(){
        return side1+side2+side3;
    }
public double Area(){
        double p = ChuVi();
        // cong thuc tinh dien tich tam giac thong qua chu vi
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
}
public String toString(){
        return side1+""+side2+""+side3+super.toString();
}
}

