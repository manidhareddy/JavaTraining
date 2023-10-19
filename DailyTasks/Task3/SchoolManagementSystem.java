package DailyTasks.Task3;
class Staff{
    //base class where all common attributes and methods are declared in this class
    //staff class is inherited by Teacher,Administration and SupportStaff class to acquire common features
    //hierarchical level inheritance
    private String name;
    private int employeeID;
    private int salary;

    public Staff(String name,int employeeID,int salary){
        this.name = name;//this represents current object
        this.employeeID = employeeID;
        this.salary = salary;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
class Teacher extends Staff{
    //inherit staff class to use common attributes
    private String subject;
    public Teacher(String name, int employeeID, int salary,String subject) {
        super(name, employeeID, salary);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
class Administrators extends Staff{
    //inherit staff class
    private String department;
    public Administrators(String name,int employeeID,int salary,String department){
        super(name,employeeID,salary);//call base class constructor
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
class SupportStaff extends Staff{
    private String role;
    public SupportStaff(String name, int employeeID, int salary,String role) {
        super(name, employeeID, salary);//call base class constructor
        this.role = role;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
public class SchoolManagementSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John Doe", 101, 50000, "Mathematics");
        Administrators admin = new Administrators("Rajesh",923,20_000,"Admissions");
        SupportStaff supportStaff = new SupportStaff("Kiran",780,15_000,"Custodian");
        System.out.println("Teacher Details: " + teacher.getName() + ", " + teacher.getEmployeeID() + ", " + teacher.getSalary() + ", " + teacher.getSubject());
        System.out.println("Admin Details: "+admin.getName()+", "+admin.getEmployeeID()+", "+admin.getSalary()+", "+admin.getDepartment());
        System.out.println("Support staff: "+supportStaff.getName()+", "+supportStaff.getEmployeeID()+", "+supportStaff.getSalary());
    }
}
