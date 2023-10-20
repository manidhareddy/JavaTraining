package Day1.Task5;
interface TV {
    public void display();
    default void dispaly3D(){
        System.out.println("Display 3D pictures");
    }
}
class SmartTV implements TV{
    @Override
    public void display(){
        System.out.println("Display moving images");
    }
}
public class DefaultMethodExample {
    public static void main(String[] args) {
        TV tv = new SmartTV();
        tv.display();
        tv.dispaly3D();
    }
}
