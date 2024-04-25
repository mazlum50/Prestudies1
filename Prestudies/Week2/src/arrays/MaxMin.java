package arrays;

public class MaxMin {
    public static void main(String[] args) {

                int[] numbers = new int[] {12, -22, 300, 43, 0};
                int max = numbers[0];
                int min = numbers[0];
                for (int number : numbers) {
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                }
                System.out.println("the maximum Number is : " + max);
                System.out.println("the minimum Number is : " + min);


    }
}
