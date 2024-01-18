import java.util.Random;
import java.util.Scanner;

public class RockPapperScissor {
    public static void main(String[] args) {
        Random rt = new Random();
        int upperbound = 3;

        byte computerPoints = 0;
        byte userPoints = 0;

        do {
            int randomNumber = rt.nextInt(upperbound);
            System.out.println("Choose: 0:Rock \n 1:Paper \n 2:Scissor");
            Scanner sc = new Scanner(System.in);
            int selected = sc.nextInt();

            if ((selected == 0 && randomNumber == 0) ||
                    (selected == 1 && randomNumber == 1) ||
                    (selected == 2 && randomNumber == 2)) {
                System.out.println("Draw!"+randomNumber);
            } else if ((selected == 0 && randomNumber == 1) ||
                    (selected == 1 && randomNumber == 2) ||
                    (selected == 2 && randomNumber == 0)) {
                System.out.println("Computer won!"+randomNumber);
                computerPoints++;
            } else if ((selected == 0 && randomNumber == 2) ||
                    (selected == 1 && randomNumber == 0) ||
                    (selected == 2 && randomNumber == 1)) {
                System.out.println("You won!"+randomNumber);
                userPoints++;
            } else {
                System.out.println("Invalid choice!");
            }
        } while (computerPoints < 3 && userPoints < 3);

        System.out.println("Computer score: " + computerPoints);
        System.out.println("User score: " + userPoints);
    }
}
