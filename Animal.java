public class Animal {
    public double weight;
    public double height;

    public Animal() {
        weight=0;
        height=0;
    }

    public Animal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String toString(){
        return "A Animal with height"+getHeight()+" and weight : "+getWeight();
    }
}
class Cat extends Animal{
    public double age;

    public Cat() {
        age=1.0;
    }

    public Cat(double age) {
        this.age = age;
    }

    public Cat(double weight, double height, double age) {
        super(weight, height);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    public String sound (){
        return "meo meo mada";
    }
    public String eat(){
        return "ăn đb ăn cút";
    }
    public String toString(){
        return" age : "+getAge()+"status : "+super.toString();
    }
}
