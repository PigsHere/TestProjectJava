import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayClassWork {
    public static void main(String[] args) {

        // PROGRAM TO CREATE ARRAY OF THREE INTEGERS
/*        int threeInt[] = new int[3];
        threeInt[0] = 25;
        threeInt[1] = 50;
        threeInt[2] = 75;
        int threeInts[] = {25, 50, 75}; */



//        PROGRAM TO CREATE ARRAY OF USER'S WISHES AND ENTER VALUES OF USER'S WISHES

/*         Scanner myInput = new Scanner(System.in);

        System.out.println("Enter the range of array: ");
        int arrayRange = myInput.nextInt();
        int arrayValue[] = new int[arrayRange];

        for (int i = 0; i < arrayRange; i++) {
            System.out.println(STR."Enter the value of array at \{i}: ");
            arrayValue[i] = myInput.nextInt();
        }

//        for(int i = 0; i < ArrayValue.length; i++) {
//            System.out.println(ArrayValue[i]);
//        }
        System.out.println(Arrays.toString(arrayValue));

 */

//        PROGRAM TO CREATE ARRAYLIST OF USER'S WISHES AND ENTER VALUES OF USER'S WISHES

/*        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter range for your data: ");
        int dataRange = new Scanner(System.in).nextInt();

        ArrayList<Integer> myValues = new ArrayList<Integer>(dataRange);

        for (int i = 0; i < dataRange; i++) {
            System.out.println(STR."Enter the value at number \{i}: ");
            myValues.add(myInput.nextInt());
        }

//        for(int i = 0; i < myValues.size(); i++) {
//            System.out.println(myValues.get(i));
//        }
        for(Integer i : myValues){
            System.out.println(i);
        }*/
/*import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        int c = 0;
        double[] noteStored = {1000.0, 500.0, 100.0, 50.0, 20.0, 10.0, 5.0, 1.0};

        double amountToPay = 5000.0;
        System.out.println("Enter Your Paid Amount:");
        double amountPaid = myInput.nextDouble();

        if (amountPaid > amountToPay) {
            double change = amountPaid - amountToPay;
            System.out.println("You have change of: Rs. " + change);

            for (int i = 0; i < noteStored.length; i++) {
                c = (int) (change / noteStored[i]);
                if (c > 0) {
                    System.out.println("Note of Rs. " + noteStored[i] + ": " + c);
                    change = change - c * noteStored[i];
                }
            }
        }
    }
}*/
    }
}


