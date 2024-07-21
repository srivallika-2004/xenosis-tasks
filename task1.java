import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert the decimal number to hexadecimal
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        // Display the result
        System.out.println("The hexadecimal equivalent of " + decimal + " is " + hexadecimal);
    }
}