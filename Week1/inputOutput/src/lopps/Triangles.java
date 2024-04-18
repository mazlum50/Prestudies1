package lopps;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How large should the triangles be? ");
        int trianglesLarge = scanner.nextInt();
        System.out.println("How many triangles would you like? ");
        int numTriangles = scanner.nextInt();
        for (int t = 0; t < numTriangles; t++) {
            for (int i = 1; i <= trianglesLarge; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    }

