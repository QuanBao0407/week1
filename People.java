public class People {
    private String name;
    private boolean gender;
    private int age;

//khai báo thuộc tính//

public People(String name, boolean gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
}
    public People() {
        name=" tên mặc định";
        age=0;
        gender=false;
    }

    // Khai báo 2 constructor//


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //getter và setter//

//phương thức toString//
    public String toString()
    {
        return "A people with name : "
                +getName()
                +"age :"
                +getAge()
                +"Gender :"
                +(isGender()?"Nam":"Nữ")
                ;
    }
}
//khởi tạo phương thức student//
class Student extends People{
    private String className;
    //khai báo thuộc tính//
    public Student(){
        super();
        className="D101_C1K14";
    }
    public Student(String className){
        super();
        this.className=className;
    }
    public Student(String className, String name, boolean gender, int age){
        super(name,gender,age);
        this.className=className;
    }
//khai báo constructor//
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    //getter và setter//
    public void study(){
        System.out.println("đang học viết code");

    }
    public String toString(){
        return"A student with class name: "+getClassName()
                +"Which is a subclass of"
                +super.toString();
    }
}
class Employee extends People{
    private String enterprise;

    public Employee(String enterprise) {
        super();
        this.enterprise = enterprise;
    }

    public Employee() {
        super();
        enterprise="CodeGym";

    }
    public Employee(String enterprise,String name,int age,boolean gender){
        super(name,gender,age);
        this.enterprise=enterprise;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
    public String toString(){
        return " A Employee work at enterprise: "+getEnterprise()+super.toString();
    }
}




