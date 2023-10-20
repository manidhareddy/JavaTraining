package Day1.Task5;
class Constructor{
    public Constructor(){
        this("mani");
        System.out.println("It is a non-Parametrized constructor");
        //calling a constructor from another constructor
    }
    public Constructor(String name){
        this(name,22);
        System.out.println("Constructor with one parameter " + name );
    }
    public Constructor(String name,int age){
        System.out.println("Constructor with two parameters "+ name +" ," +age);
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        Constructor const1 = new Constructor();
    }

}
