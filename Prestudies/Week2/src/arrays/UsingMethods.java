package arrays;

public class UsingMethods {
    public static void main(String[] args) {
        int[] numbers = new int[] {2, 2, 10, 11, 10};
        int multiplier = 2;
        printMultipliedArray(numbers, multiplier);
        System.out.println("\nNumbers in main method");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.printf("\nMultiplier in main method: %d ", multiplier);
    }
    private static void printMultipliedArray(int[] numbersReference, int multiplier) {
        multiplier++;
        for (int i = 0; i < numbersReference.length; i++) {
            numbersReference[i] = numbersReference[i] * multiplier;
        }
        System.out.println("Numbers in 'printMultipliedArray'");
        for (int i = 0; i < numbersReference.length; i++) {
            System.out.printf("%d ", numbersReference[i]);
        }
        System.out.printf("\nMultiplier in 'printMultipliedArray': %d ", multiplier);
    }
}
