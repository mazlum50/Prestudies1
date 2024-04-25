package arrays;

public class BasicSum {
    public static void main(String[] args) {
        int[] numbers = new int[] {12, -22, 300, 43, 0};
        int sumNum = 0;
        for (int number:numbers) {
            sumNum += number;
        }
        System.out.println(sumNum);
    }
}
