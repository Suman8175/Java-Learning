import java.util.Scanner;

public class InputNumberValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        int number = 0;
        double number2 = 0;


        while (!validInput) {
            System.out.print("Enter two number: ");
            String input = scanner.nextLine();
            String input2 = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
                number2 = Double.parseDouble(input2);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        System.out.println("You entered the number: " + number + "  another number: "+number2);
    }
}
