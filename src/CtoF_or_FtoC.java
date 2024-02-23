import java.util.Scanner;

public class CtoF_or_FtoC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsiusTemperature = 0; // Initialize celsius variable (for user input OR conversion)
        double fahrenheitTemperature = 0; // Initialize fahrenheit variable (for user input OR conversion)
        String trash = ""; // Initialize trash variable (bad user input)
        boolean done1 = false; // Initialize done1 variable and set to false for do while loop
        boolean done2 = false; // Initialize done2 variable and set to false for do while loop
        boolean done3 = false; // Initialize done3 variable and set to false for do while loop
        String fahOrCel = ""; // Initialize fahOrCel variable (to decide FtoC or CtoF)
        do {
            System.out.print("What type of temperature will you be supplying [F or C]?: "); // Prompt user for what type of temperature they will be supplying
            fahOrCel = in.nextLine(); // Reads a string value from the user
            if (fahOrCel.equals("C")) { // Condition: If fahOrCel (user input) is equal to "C",
                do {
                    System.out.print("Enter a temperature in celsius: "); // Prompt user for temperature in celsius
                    if (in.hasNextDouble()) { // Condition: If it's safe to read in a double
                        celsiusTemperature = in.nextDouble(); // Reads a double value from the user
                        in.nextLine(); // Clears the newline from the buffer
                        done1 = true; // Set done1 to true since it is the string we want, and therefore we can end the outer loop
                        done2 = true; // Set done2 to true since it is a valid number, and therefore we can end the inner loop
                    } else {
                        trash = in.nextLine(); // Not a double so read the user input as a string
                        System.out.println("You said the temperature was " + trash + ", which is not a valid temperature."); // Output that the user input is not a valid temperature
                        System.out.println("You have to enter a valid temperature."); // Output that the user should enter a valid temperature
                    }
                } while(!done2); // Loop: While done2 variable is false (loop will stop when done2 is true, or in other words once the user enters a valid temp.)
                fahrenheitTemperature = 1.8 * (celsiusTemperature) + 32; // Set the fahrenheitTemperature variable to the celsius to fahrenheit equation
                System.out.println("The temperature in fahrenheit is " + fahrenheitTemperature); // Output the temperature in fahrenheit
            } else if (fahOrCel.equals("F")) { // Condition: If fahOrCel is equal to "F",
                do {
                    System.out.print("Enter a temperature in fahrenheit: "); // Prompt user for temperature in fahrenheit
                    if (in.hasNextDouble()) { // Condition: If it's safe to read in a double
                        fahrenheitTemperature = in.nextDouble(); // Reads a double value from the user
                        in.nextLine(); // Clears the newline from the buffer
                        done1 = true; // Set done1 to true since it is the string we want, and therefore we can end the outer loop
                        done3 = true; // Set done3 to true since it is a valid number, and therefore we can end the inner loop
                    } else {
                        trash = in.nextLine(); // Not a double so read the user input as a string
                        System.out.println("You said the temperature was " + trash + ", which is not a valid temperature."); // Output that the user input is not a valid temperature
                        System.out.println("You have to enter a valid temperature."); // Output that the user should enter a valid temperature
                    }
                } while(!done3); // Loop: While done3 variable is false (loop will stop when done3 is true, or in other words once the user enters a valid temp.)
                celsiusTemperature = (double) 5/9 * (fahrenheitTemperature - 32); // Set the celsius variable to the fahrenheit to celsius equation, and convert the equation to double since there is a fraction
                System.out.println("The temperature in celsius is " + celsiusTemperature); // Output the temperature in celsius
            } else {
                System.out.println("You have to enter F or C."); // Output that the user should enter F or C if they entered something else
            }
        } while(!done1); // Loop: While done1 variable is false (loop will stop when done1 is true, or in other words when the user enters F or C)
    }
}
