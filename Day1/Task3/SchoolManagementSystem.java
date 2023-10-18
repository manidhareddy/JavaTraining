package Day1.Task3;
class Staff{
    //base class where all common attributes and methods are declared in this class
    //staff class is inherited by Teacher,Administration and SupportStaff class to acquire common features
    //hierarchical level inheritance
    String name;
    int employeeID;
    int salary;
    String role;
    String responsibilities;
    public Staff(String name,int employeeID,int salary){
        this.name = name;//this represents current object
        this.employeeID = employeeID;
        this.salary = salary;
    }
    public void staffDetails(){
        System.out.println("Staff Details:-");
        System.out.println("staff name: "+this.name + "\nemployeeID: "+ this.employeeID + " \nRole: "+this.role +" \nResponsibilities: "+this.responsibilities);
    }
}
class Teacher extends Staff{
    //inherit staff class to use common attributes
    String subject;
    public Teacher(String name, int employeeID, int salary,String subject) {
        super(name, employeeID, salary);
        this.role = "Teaching";
        this.responsibilities = "To teach students and help them grow their academic knowledge.";
        this.subject = subject;
    }
    public void teach(){
        System.out.println(this.name + " teaches "+this.subject);
    }
}
class Administrators extends Staff{
    //inherit staff class
    String department;
    public Administrators(String name,int employeeID,int salary,String department,String role,String responsibilities){
        super(name,employeeID,salary);//call base class constructor
        this.department = department;
        this.role = role;
        this.responsibilities = responsibilities;
    }
    public void manage(){
        System.out.println(this.name + " manages "+this.department + " department");
    }
}
class SupportStaff extends Staff{
    public SupportStaff(String name, int employeeID, int salary) {
        super(name, employeeID, salary);//call base class constructor
        this.role = "provide support";
        this.responsibilities = "clear doubt for students";
    }
    public void teacherOnLeave(){
        System.out.println("carry out specific tasks set by the main teacher");
    }
}
public class SchoolManagementSystem {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ravi",823,23_000,"Math");
        Administrators admin = new Administrators("Rajesh",923,20_000,"Admissions","Collect details","To take new admissions");
        SupportStaff supportStaff = new SupportStaff("Kiran",780,15_000);
        teacher1.staffDetails();
        teacher1.teach();
        admin.staffDetails();
        admin.manage();
        supportStaff.staffDetails();
        supportStaff.teacherOnLeave();
    }
}
