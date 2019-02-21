/**
 * Created by 027937 on 2/19/2019. Exercise 6
 */
import java.util.Scanner;

class UserInput {
    Scanner scanner = new Scanner(System.in);


    public String promptString(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();

        String userString = "";
        boolean isString = false;
        while (!isString) {
            try {
                userString = userInput;
                isString = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid String. " + message);
                userInput = scanner.nextLine();
            }
        }

        return userString;
    }

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }

        }

        return userInt;
    }


    public double promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        Double userDouble = 0.0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid Double value. " + message);
                userInput = scanner.nextLine();
            }
        }

        return userDouble;
    }
}

public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int aNumber = input.promptInt("Enter an integer value.");
        System.out.println(aNumber);

        UserInput input1 = new UserInput();
        String aString = input1.promptString("Enter an String.");
        System.out.println(aString);

        UserInput input2 = new UserInput();
        double aDouble = input2.promptDouble("Enter an Double Value.");
        System.out.println(aDouble);
    }
}