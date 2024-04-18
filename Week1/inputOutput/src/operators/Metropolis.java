package operators;
import java.util.Scanner;
public class Metropolis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of the city: ");
        String name = scanner.nextLine();
        System.out.print("Is " + name + " a capital ('true' or 'false')? ");
        boolean isCapital = scanner.nextBoolean();
        System.out.print("What is the population of " + name + "?");
        int population = scanner.nextInt();
        System.out.print("Tax income per inhabitant :");
        double taxPerPerson = scanner.nextDouble();
        if ((isCapital && population > 100000) ) {
            System.out.println(name + " is a metropolis, because it is a capital with a population of " +  population);
        }
        else if  (population > 200000 && taxPerPerson * population >= 1000000000){
            System.out.println(name + " is a metropolis, because it has " +  population +" inhabitants and an annual tax income of " + (taxPerPerson * population) + " euro" );

        }
        else {
            System.out.println(name + " is no metropolis");
        }
    }
}
