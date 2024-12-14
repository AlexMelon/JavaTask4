import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] weekdays = {
                "Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"
        };

        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for a day position
            System.out.print("Enter the day position: ");
            int position = scanner.nextInt();

            System.out.println("The day at position " + position + " is: " + weekdays[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: ArrayIndexOutOfBoundException");
        }

        scanner.close();
    }
}