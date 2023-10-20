package Day1.Task5;
interface TV {
    public void display();
    default void display3D(){
        System.out.println("Display 3D pictures");
    }
}
class SmartTV implements TV{
    @Override
    public void display(){
        System.out.println("Display moving images");
    }
}
class AndroidTV implements TV{
    @Override
    public void display(){
        System.out.println("display images");
    }
    @Override
    public void display3D(){
        System.out.println("display 3d moving images");
    }

}
public class DefaultMethodExample {
    public static void main(String[] args) {
        TV tv = new SmartTV();
        tv.display();
        tv.display3D();
        TV tv1 = new AndroidTV();
        tv1.display3D();
    }
}
