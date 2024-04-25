package inputOutput;
import java.util.Scanner;

public class TextInputOutput {
    public static void main(String[] args) {
        //Scanner-Objekt erstellt
        Scanner scanner = new Scanner(System.in);
        //Aufforderung, den Namen einzugeben
        System.out.print("Please enter your name: ");
        //input in String Variable speichen
        String name = scanner.nextLine();
        //ersten Buchstaben in einem Großbuchstaben umwandeln
        String nameUpper = name.substring(0, 1).toUpperCase() + name.substring(1);
        //Begrüßung mit dem eingegebenen Namen
        System.out.print("Hello " + nameUpper + ", Welcome to the training!");
    }
}
