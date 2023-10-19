package Day1.Task4;
class Calculator {
    public void operation(double... numbers){
        System.out.println("perform some calculation operation");
    }
}
class Addition extends Calculator{
    @Override
    public void operation(double... numbers){
        double sum =0;
        if(numbers.length<=2){ System.out.println("Give more than two numbers"); return;}
        for(double number : numbers){
            sum += number;
        }
        System.out.println("Addition of Numbers :"+sum);
    }
}
class Multiplication extends Calculator{
    @Override
    public void operation(double... numbers){
        double value =0;
        if(numbers.length<=2){ System.out.println("Give more than two numbers"); return;}
        for(double number : numbers){
            value *= number;
        }
        System.out.println("Multiplication of Numbers :"+value);
    }
}
class Subtraction extends Calculator{
    @Override
    public void operation(double... numbers){
        double value =0;
        if(numbers.length<=2){ System.out.println("Give more than two numbers"); return;}
        for(double number : numbers){
            value -= number;
        }
        System.out.println("Subtraction of Numbers :"+value);
    }
}
class Division extends Calculator{
    @Override
    public void operation(double... numbers){
        double value =0;
        if(numbers.length<=2){ System.out.println("Give more than two numbers"); return;}
        for(double number : numbers){
            value /= number;
        }
        System.out.println("Division of Numbers :"+value);
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Calculator addition = new Addition();
        addition.operation(2,3,4,5);
        Calculator multiplication = new Multiplication();
        multiplication.operation(2,3,4);
        Calculator subtraction = new Subtraction();
        subtraction.operation(34,2,6,7,8);
    }
}
