import java.util.ArrayList;
import java.util.Scanner;

public class ArrayClassWorkTwo {
    public static void main(String[] args) {

        // PROGRAM TO CREATE ARRAYLIST OF 10 OF USER'S VALUES AND SEPARATE EVEN AND ODD NUMBERS IN THEIR RESPECTIVE ARRAYLISTS
        // AND ALSO TO COMPARE SIZE AND SUM OF THE EVEN AND ODD LISTS AND COMPARE THEM AND PRINT WHICH IS GREATER

        Scanner myInput = new Scanner(System.in);

        int range = 10;
        ArrayList<Integer> myNumbers = new ArrayList<>(range);
        ArrayList<Integer> myEvenNumbers = new ArrayList<>();
        ArrayList<Integer> myOddNumbers = new ArrayList<>();

        for (int i = 0; i < range; i++) {
            System.out.println(STR."Enter number in position \{i + 1}:");
            myNumbers.add(myInput.nextInt());

            if (myNumbers.get(i) % 2 == 0) {
                myEvenNumbers.add(myNumbers.get(i));
            }

            else {
                myOddNumbers.add(myNumbers.get(i));
            }
        }

        System.out.println("Even Numbers: ");
        System.out.println(myEvenNumbers);

        System.out.println("Odd Numbers: ");
        System.out.println(myOddNumbers);

        if (myEvenNumbers.size() > myOddNumbers.size()) {
            System.out.println(STR."Size of Even Numbers is Greater with its length being \{myEvenNumbers.size()}");
        }

        else {
            System.out.println(STR."Size of Odd Numbers is Greater with its length being \{myOddNumbers.size()}");
        }

        int sumEven = 0;
        int sumOdd = 0;

        for (int sumEvens : myEvenNumbers) {
            sumEven += sumEvens;
        }

        for (int sumOdds : myOddNumbers) {
            sumOdd += sumOdds;
        }

        if (sumEven > sumOdd) {
            System.out.println(STR."Sum of Even Numbers is Greater with its sum being \{sumEven}");
        }

        else {
            System.out.println(STR."Sum of Odd Numbers is Greater with its sum being \{sumOdd}");
        }

    }
}