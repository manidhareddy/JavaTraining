package Day1.Task3;
class Car{
    //created a car class with properties and functionality
    private String color,engineType,typeBrand,carType;
    private boolean ac,bootSpace,musicSystem,navigationSystem;
    private int price;
    public Car(String color,String engineType,String typeBrand,boolean ac,boolean bootSpace,boolean musicSystem,boolean navigationSystem,int price,String carType){
        //parameterized constructor to initialize object
        this.color = color;this.engineType = engineType;//bs6 or bs4
        this.typeBrand = typeBrand;this.ac = ac;this.bootSpace = bootSpace;
        this.musicSystem = musicSystem;this.navigationSystem = navigationSystem;
        this.price = price;this.carType = carType;//SUV,MVP,Sedan
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public String getTypeBrand() {
        return typeBrand;
    }
    public void setTypeBrand(String typeBrand) {
        this.typeBrand = typeBrand;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public boolean isAc() {
        return ac;
    }
    public void setAc(boolean ac) {
        this.ac = ac;
    }
    public boolean isBootSpace() {
        return bootSpace;
    }
    public void setBootSpace(boolean bootSpace) {
        this.bootSpace = bootSpace;
    }
    public boolean isMusicSystem() {
        return musicSystem;
    }
    public void setMusicSystem(boolean musicSystem) {
        this.musicSystem = musicSystem;
    }
    public boolean isNavigationSystem() {
        return navigationSystem;
    }
    public void setNavigationSystem(boolean navigationSystem) {
        this.navigationSystem = navigationSystem;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString(){
       return this.carType + ", "+this.typeBrand+", "+this.color+", "+this.price;
    }
}
public class CarExample {
    public static void main(String[] args) {
        Car supra = new Car("black","bs4","Toyota",true,true,true,true,6_00_00_000,"sport car");
        supra.start();
        supra.accelerate();
        supra.stop();
        System.out.println(supra);
        Car i20 = new Car("red","bs6","Honda",true,true,true,false,10_00_000,"SUV");
        System.out.println(i20);
    }
}
