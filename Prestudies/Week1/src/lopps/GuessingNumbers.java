package lopps;
import java.util.Scanner;
public class GuessingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess;
        do {
            System.out.println("Enter a number between 1 and 100:");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Your number is greater than the Number we have, try again");
            } else if (guess > randomNumber) {
                System.out.println("Your number is less than than the Number we have, try again");
            } else {
                System.out.println("you won");
            }
        } while (guess != randomNumber);


    }
}
