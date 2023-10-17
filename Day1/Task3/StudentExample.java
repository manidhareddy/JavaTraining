package Day1.Task3;
class Student{
    private String name;
    private String rollNumber;
    private int age;
    private String address;
    Student(){}
    Student(String name,String rollNumber,int age,String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public String getRollNumber(){
        return this.rollNumber;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;
    }
    public void setName(String name){
            this.name = name;
    }
    public void setRollNumber(String rollNumber){
        if(this.rollNumber == null){
            this.rollNumber = rollNumber;
        }
        else{
            System.out.println("you can't change roll number");
        }
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
public class StudentExample {
    public static void main(String[] args) {
        Student student1  = new Student("Ramu","19at1a04a5",22,"krishna nagar , kurnool");
        System.out.println(student1.getName());
        System.out.println(student1.getRollNumber());
        System.out.println(student1.getAddress());
        Student newStudent = new Student();
        //Student class attributes are private, so we can't access them with .(dot) operator, so we are using getter and setter methods
        newStudent.setName("Deepak");
        newStudent.setRollNumber("19at1a05f4");
        newStudent.setAddress("sri ram nagar, chennai");
        System.out.println(newStudent.getName());
        System.out.println(newStudent.getRollNumber());
        System.out.println(newStudent.getAge() + "\n"+ newStudent.getAddress());
        newStudent.setRollNumber("19023rty");
    }

}
