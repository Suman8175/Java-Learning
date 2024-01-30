import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Game{
    int noOfGuess=0;
    int randomNumber;
    int guessedNumber;
    boolean isCorrect=false;
    Scanner sc=new Scanner(System.in);
    Game(){
        Random random=new Random();
        int upperbound = 100;
        this.randomNumber=random.nextInt(upperbound);
        System.out.println("The random number is"+randomNumber);
        TakeUserInput();
    }
    public void TakeUserInput(){
        while(!isCorrect){
            System.out.println("Enter a number");
            try {
                if (sc.hasNextInt()) {
                    guessedNumber = sc.nextInt();
                } else {
                    sc.next(); // Consume invalid input
                    System.out.println("Invalid input. Game Terminated......");
                    break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Consume the invalid input
            }


//            guessedNumber=sc.nextInt();

            IsCorrectNumber();
        }

    }
    public boolean IsCorrectNumber(){

        if (guessedNumber<randomNumber){
            noOfGuess++;
            System.out.println("Your guess is smaller than the actual number");
            return false;
        }
       else if (guessedNumber>randomNumber){
            noOfGuess++;
            System.out.println("Your guess is bigger than the actual number");
            return false;
        }
       else if (guessedNumber==randomNumber){
            noOfGuess++;
            System.out.println("Your guess is correct");
            System.out.println("Your guessed the number in "+noOfGuess+" tries.");
            isCorrect=true;
            return true;

        }
       return false;
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        Game g1=new Game();
    }
}
