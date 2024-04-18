package inputOutput;
import java.util.Scanner;
public class Geometry {
    public static void main(String[] args) {
    //////////////////INPUT///////////////////////////
        //Scanner-Objekt erstellt
        Scanner scanner = new Scanner(System.in);
        //Aufforderung, erste Value einzugeben
        System.out.print("Please enter the first value : ");
        //erste Input Value in Double Variable Positive Zahl speichen
        double a =  Math.abs(scanner.nextDouble());
        //Aufforderung, zweite Value  einzugeben
        System.out.print("Please enter the second value : ");
        //zweite Input Value in Double Variable als Positive Zahl  speichen
        double b = Math.abs(scanner.nextDouble());
        //////////////////Rechteck///////////////////////////
        /////Rechteck Fläche „Länge mal Breite“ a * b
        double rectangleArea = a * b;
        //Rechteck Umfang  "2a+2b" = 2 * (a+b)
        double rectanglePerimeter = 2 * (a + b);
        //////////////////Rechtwinkliges Dreieck ///////////////////////////
        /////Rechtwinkliges Fläche 0.5 * a * b
        double rightTriangleArea = 0.5 * a * b;
        //Rechteck Umfang  a+b+c , c ist hypotenuse
        // hypotenuse rechnung
        double hypotenuse =  Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        double rightTrianglePerimeter = a + b + hypotenuse ;
        // Gib die Ergebnisse aus
        System.out.println("The Rectangle Area is  : " + rectangleArea);
        System.out.println("The Rectangle Perimeter is  : " + rectanglePerimeter);
        System.out.println("The Right Triangle Area is " + rightTriangleArea);
        System.out.println("The Right Triangle Perimeter is " + rightTrianglePerimeter ) ;
    }
}
