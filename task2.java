
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Variable to keep track of the current number
        int number = 1;

        // Loop for each row
        for (int i = rows; i >= 1; i--) {
            // Print spaces at the beginning of each row
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            // Print numbers in increasing order
            for (int k = 1; k <= i; k++) {
                System.out.print(number++ + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
