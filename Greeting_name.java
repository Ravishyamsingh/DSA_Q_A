import java.util.Scanner;

public class GreetingName {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Program title
        System.out.println("=== Greeting Application ===");

        // Ask user for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Validate input
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty. Please run the program again.");
        } else {
            // Call greeting method
            greetUser(name);
        }

        // Close scanner
        scanner.close();
    }

    // Method to greet the us
