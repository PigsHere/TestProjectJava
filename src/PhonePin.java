import java.util.Scanner;

public class PhonePin {
    public static void main(String[] args) {
        //WAP TO MIMIC YOUR PHONE'S PIN CHECKER

        Scanner myInput = new Scanner(System.in);
        int pin = 19168;
        int attempts = 0;
        int userinput;

        System.out.println("Enter your pin");
        userinput = myInput.nextInt();

        do{
            System.out.println("PIN IS INCORRECT TRY AGAIN");
            userinput = myInput.nextInt();
            attempts++;
        }

        while(userinput != pin);

        if(attempts == 5){
            System.out.println("TOO MANY ATTEMPTS");
        }

        if(userinput == pin){
            System.out.println("PIN IS CORRECT");
        }
    }
}

// ASSIGNMENT IS TO CREATE HOT COLD GAME

// assignment IS ALSO TO CREAT A CAR GAME WHERE TYPE START TO START CAR STOP TO STOP CAR AND QUIT TO END THE GAME