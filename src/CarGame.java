import java.util.Scanner;

public class CarGame {
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        int time = 0;
        int CarDistanceTravelled = 0;

        System.out.println("Ready to Start the Car? Type 'Start' To Start Your Car or 'Quit' to End the Program.");
        String CarFunction = myInput.nextLine();

        if (CarFunction.toUpperCase().equals("START")) {
            System.out.println("Car is starting!");
            System.out.println("Your Car Has Travelled: ");
        }

        while (!CarFunction.toUpperCase().equals("QUIT") && time <= 5) {

            if (CarFunction.toUpperCase().equals("START")) {
                CarDistanceTravelled++;
                System.out.println(STR."\{CarDistanceTravelled}m");
                time++;
            }

            if (time == 5) {
                System.out.println("Do You Want to Stop Your Car? Type 'Stop' To Stop Your Car or 'Quit' to End the Program.");
                String CarInnerFunction = myInput.nextLine();

                if (CarInnerFunction.toUpperCase().equals("STOP")) {
                    System.out.println("Car is stopping!");
                    System.out.println("Your car has stopped.");

                    System.out.println("Do You Want to Start Your Car Again?");
                    System.out.println("Type 'Start' To Start Your Car or 'Quit' to End the Program.");
                    CarDistanceTravelled = 0;
                    time = 0;

                    CarFunction = myInput.nextLine();
                }

                else if (CarInnerFunction.toUpperCase().equals("QUIT")) {
                    System.out.println("Exiting the program.");
                    break;
                }

                else {
                    CarFunction = CarInnerFunction;
                    time = 0;
                }
            }
        }

        if (CarFunction.toUpperCase().equals("QUIT")) {
            System.out.println("Program Successfully Exited!");
        }
    }
}
