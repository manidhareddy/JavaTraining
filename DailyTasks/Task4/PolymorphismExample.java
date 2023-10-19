package DailyTasks.Task4;
class Calculator{
    public Calculator(){}
    //method overloading is a compile time polymorphism
    //When two or more methods with same name but different parameters
    public int addition(int number1,int number2){
        return number1 + number2;
    }
    public int addition(int number1,int number2,int number3){
        return number1 + number2 + number3;
    }
    public double addition(double number1 ,double number2){
        return number1 + number2;
    }
    public double addition (double number1, double number2 , double number3){
        System.out.println("addition with three parameters is called");
        return number1 + number2 + number3;
    }
    public double addition(double ...numbers){
        //it is a vararg method it takes variable length arguments
        //it basically takes an array of values

        double value = 0;
        for(double number : numbers){
            value += number;
        }
        return value;
    }
    public double subtraction(double number1 , double number2){
        return number1 - number2;
    }
    public double subtraction(double number1,double number2,double number3){
        return number1 - number2 - number3;
    }
    public int multiplication(int number1,int number2){
        return number1 * number2;
    }
    public long multiplication(int number1,int number2,int number3){
        return (long) number1 * number2 * number3;
    }

    public int division(int number1,int number2){
        return number1 / number2;
    }
    public int division(int number1,int number2,int number3){
        return number1/number2/number3;
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Addition of two numbers: "+cal.addition(23,45));
        System.out.println("Addition of two numbers: "+cal.addition(256,78,12));
        System.out.println("Multiplication of three numbers: "+cal.multiplication(23,4,5));
    }
}
