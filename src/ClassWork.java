import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {

        //PROGRAM TO PRINT ODD NUMBER FROM 1 TO 100
        int i = 1;
        int j = 0;
//        for(i = 1;i <= 100;i =i +2){
//            System.out.println(STR." \{i}");
//        }

        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }

//PROGRAM TO PRINT EVEN NUMBER FROM 1 TO 100

//        for(j = 0;j <= 100; j = j +2){
//            System.out.println(STR." \{i}");
//        }

        while (j <= 100) {
            System.out.println(j);
            j = j + 2;
        }

//PROGRAM TO PRINT NUMBER FROM 1 TO 100

//        for(i = 0;i <=100;i++){
//            System.out.println(STR." \{i}");
//        }
        while (j <= 100) {
            System.out.println(j);
            j++;
        }

//PROGRAM TO PRINT "Ram" user given time

        String a = "Ram";
        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter how many times you want to print the name: ");
        int count = myInput.nextInt();

//        for(j = 0;j <= count; j++)
//        {
//            System.out.println(STR." \{a}");
//        }

        while (j <= count) {
            System.out.println(STR."\{a}");
            j++;
        }
    }
}

// TO PRINT FIZZ IF DIVISIBLE BY 3 BUZZ IF DIVISIBLE BY 5 AND FIZZBUZZ IF DIVISIBLE BY BOTH

//int number = 0;
//
//    for(number; number <= 100; number+=){
//        if(number % 3 == 0){
//            System.out.println("Fizz");
//        }
//        if(number % 5 == 0){
//            System.out.println("Buzz");
//        }
//        else if(number % 3 == 0 && number % 5 ==0){
//            System.out.println("FizzBuzz");
//        }
//    }
//}


//WAP TO MIMIC YOUR PHONE'S PIN CHECKER

