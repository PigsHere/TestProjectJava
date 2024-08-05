import java.util.Scanner;
import java.lang.Math;


public class HotColdGame {
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        int NumberToGuess = 500;
        int MaxAttempts = 15;
        int TotalAttempts = 0;

        System.out.println("Welcome to HotCold Game!");
        System.out.println("The Number Lies Between 1 and 1000");
        System.out.println("Please enter your number to guess: ");

        int UserGuess = myInput.nextInt();

        while (TotalAttempts < MaxAttempts && UserGuess != NumberToGuess) {

            if(Math.abs(UserGuess - NumberToGuess) <= 100) {
                System.out.println("Volcanic Warm");
            }
            if(Math.abs(UserGuess - NumberToGuess) > 100 && Math.abs(UserGuess - NumberToGuess) <= 200) {
                System.out.println("Very Warm");
            }
            if(Math.abs(UserGuess - NumberToGuess) > 200 && Math.abs(UserGuess - NumberToGuess) <= 400) {
                System.out.println("Cold");
            }
            if(Math.abs(UserGuess - NumberToGuess) > 400 && Math.abs(UserGuess - NumberToGuess) < 1000) {
                System.out.println("Very Cold");
            }

            TotalAttempts++;
            UserGuess = myInput.nextInt();
        }

        if (TotalAttempts == MaxAttempts) {
            System.out.println("You Lose! Too Many Attempts!");
        }

        if(UserGuess == NumberToGuess) {
            System.out.println("You Win! Congratulations!");
        }

    }
}