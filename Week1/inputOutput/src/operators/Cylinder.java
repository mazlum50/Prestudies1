package operators;
import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args) {
        //Scanner-Objekt erstellt
        Scanner scanner = new Scanner(System.in);
        // Eingabe des Umfangs c
        System.out.print("Umfang eingeben (c): ");
        double c = scanner.nextDouble();
        // Eingabe  der Höhe h
        System.out.print("Höhe eingeben (h): ");
        double h = scanner.nextDouble();
        // Berechnung des Durchmessers (d) des Deckels
        double d = c / Math.PI;
        // Berechnung der Fläche des Deckels (al)
        double al = Math.PI * Math.pow(d / 2, 2);
        // Berechnung der Fläche des Gehäuses (ac)
        double ac = c * h;
        // Berechnung der gesamten benötigten Blechfläche (at)
        double at = 2 * al + ac;
        // Output
        System.out.println("Sheet metal area: " + at);
        System.out.println("Volume: " + (al * h));

    }
}
