package DailyTasks.Task2;
class Animal {
    String walk(){
        return "I am walking";
    }
}
class Bird extends Animal {
    String fly(){
        return "I am flying";
    }
}
class SingingBirds extends Bird{
    String sing(){
        return "I am singing";
    }
}
public class Inheritance {
    public static void main(String[] args) {
        SingingBirds parrot = new SingingBirds();
        System.out.println(parrot.walk());
        System.out.println(parrot.fly());
        System.out.println(parrot.sing());
    }
}
