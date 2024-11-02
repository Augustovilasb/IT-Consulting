package CA_2;

import java.util.Scanner;

public class InputService {

    private Scanner myKB;

    public InputService() {
        myKB = new Scanner(System.in);
    }

    public String getUserInput(String prompt) {
        System.out.print(prompt);
        return myKB.nextLine();
    }

    public int getUserInputInt(String prompt) {
        System.out.print(prompt);
        int attempts = 0;
        final int maxAttempts = 3;

        while (attempts < maxAttempts) {
            String userInput = myKB.nextLine();

            try {

                return Integer.parseInt(userInput);

            } catch (NumberFormatException e) {

            attempts++;
            System.out.println("Invalid input. Enter a valid integer number");

            if (attempts < maxAttempts) {
                System.out.println("Make sure you're only inputting integer numbers.");
                System.out.println(prompt);
            } else {
                System.out.println("It's your third attempt at moment, please restart the program.");
                }
            }
        }
        return -1;

      }

    }