package Day1.Task1;

public class Task1 {
    public static void main(String[] args) {
        largestNumber(2,4,5);
        leapYear(2004);
        firstNFibonacci(10);
        sumOfEvenNumbers();
    }
    static void largestNumber(int firstNumber,int secondNumber,int thirdNumber){
        int largeNumber;
        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            largeNumber = firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            largeNumber = secondNumber;
        }
        else{
            largeNumber = thirdNumber;
        }
        System.out.println("The largest of three numbers is " +largeNumber);
    }
    static void leapYear(int year){
        int value = ((year%4 == 0 && year%100 !=0 )|| year%400 ==0) ? 0 :1;
        switch(value){
            case 0 :
                System.out.println("Given year is leap year");
                break;
            case 1 :
                System.out.println("Given year is not a leap year");
                break;
            default:
                System.out.println("Given year is not a leap year");
        }
    }
    static void firstNFibonacci(int n){
        int fibonacciA = 0;
        int fibonacciB = 1;
        for(int i=1;i<=n;i++){
            System.out.print(fibonacciA + " ");
            int tempFibonacci = fibonacciA + fibonacciB;
            fibonacciA = fibonacciB;
            fibonacciB = tempFibonacci;
        }
    }
    static void sumOfEvenNumbers(){
        int sum = 0;
        int start=1;
        while(start<=100){
            if(start%2==0){
                sum+=start;
            }
            start++;
        }
        System.out.println("\nSum of even numbers from 1 to 100 is "+sum);
    }
}
