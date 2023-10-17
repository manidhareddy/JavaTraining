package Day1.Task3;
class Car{
    //created a car class with properties and functionality
    String color;
    String engineType;
    String typeBrand;
    boolean ac;
    boolean bootSpace;
    boolean musicSystem;
    boolean navigationSystem;
    int price;
    String carType;
    Car(String color,String engineType,String typeBrand,boolean ac,boolean bootSpace,boolean musicSystem,boolean navigationSystem,int price,String carType){
        //parameterized constructor to initialize object
        this.color = color;
        this.engineType = engineType;//bs6 or bs4
        this.typeBrand = typeBrand;
        this.ac = ac;
        this.bootSpace = bootSpace;
        this.musicSystem = musicSystem;
        this.navigationSystem = navigationSystem;
        this.price = price;
        this.carType = carType;//SUV,MVP,Sedan
    }
    public void stop(){
        System.out.println("Stop the car!");
    }
    public void start(){
        System.out.println("Start car engine.");
    }
    public void accelerate(){
        System.out.println("Start moving..");
    }
    public void carDetails(){
        System.out.println("Car Details :");
        System.out.println("Car color: "+this.color);
        System.out.println("Car Engine Type: "+this.engineType);
        System.out.println("Car TypeBrand: "+this.typeBrand);
        System.out.println("Car Type: "+this.carType);
        System.out.println("Car price: "+this.price);
    }

}
public class CarExample {
    public static void main(String[] args) {
        Car supra = new Car("black","bs6","Toyota",true,true,true,true,6_00_00_000,"sport car");
        supra.start();
        supra.accelerate();
        supra.stop();;
        supra.carDetails();
        Car i20 = new Car("red","bs4","Honda",true,true,true,false,10_00_000,"SUV");
        i20.carDetails();
    }
}
