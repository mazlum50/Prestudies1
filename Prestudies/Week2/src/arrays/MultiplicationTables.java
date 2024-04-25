package arrays;

public class MultiplicationTables {
        public static void main(String[] args) {
            int[][] table = new int[10][10];

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    table[i-1][j-1] = (i) * (j);
                    System.out.printf("%5d", i * j);
                }
                System.out.println();
            }

        }

}
