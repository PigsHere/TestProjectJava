import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        WAP TO PRINT HELLO WORLD
        System.out.println("Hello world!");

//        WAP TO PRINT SUM OF TWO NUMBERS
        int a = 25;
        int b = 35;
        int sum;
        sum = a + b;
        System.out.printf(STR."The sum is\{sum}");

//       WAP TO PRINT SIMPLE INTEREST
        int Principle = 50000;
        int Time = 2;
        int Rate = 10;
        int SimpleInterest;

        SimpleInterest = (Principle * Time * Rate / 100);
        System.out.printf(STR."The Simple Interest is \{SimpleInterest}");

//          WAP TO PRINT AREA OF RECTANGLE
        int length = 5;
        int breadth = 5;
        int area;
        area = length * breadth;

        System.out.printf(STR."The area of the rectangle is\{area}");
    }
}