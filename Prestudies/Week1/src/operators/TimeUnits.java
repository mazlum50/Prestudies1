package operators;
import java.util.Scanner;
public class TimeUnits {
    public static void main(String[] args) {
        //Scanner-Objekt erstellt
        Scanner scanner = new Scanner(System.in);
        // Eingabe der Sekunden
        System.out.print("Please enter number of seconds: ");
        long seconds = scanner.nextLong();
        // Berechnung Jahre, Tage, Stunden, Minuten
        long years = seconds / (365 * 24 * 60 * 60);
        seconds %= 365 * 24 * 60 * 60;
        long days = seconds / (24 * 60 * 60);
        seconds %= 24 * 60 * 60;
        long hours = seconds / (60 * 60);
        seconds %= 60 * 60;
        long minutes = seconds / 60;
        seconds %= 60;

        // Output
        System.out.println(years + " Years and " + days + " Day and " + hours + " Hours and " + minutes + " Minutes and " + seconds + " Sekonds");

    }
}
