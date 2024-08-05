import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddArrayListProgram {

    public static void main(String[] args) {

        // PROGRAM TO CREATE ARRAYLIST OF 10 OF USER'S VALUES AND SEPARATE EVEN AND ODD NUMBERS IN THEIR RESPECTIVE ARRAYLISTS

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

    }
}