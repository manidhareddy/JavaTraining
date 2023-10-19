package Day1.Task5;
class Constructor{
    //constructor chaining using constructor overloading
    //constructor are special methods they don't contain return type
    public Constructor(){
        System.out.println("It is a non-Parametrized constructor");
    }
    public Constructor(String name){
        this();//call current  object constructor
        System.out.println("Constructor with one parameter " + name );
    }
    public Constructor(String name,int age){
        this(name);
        System.out.println("Constructor with two parameters "+ name +" ," +age);
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        Constructor const1 = new Constructor("manidhar",22);
    }

}
