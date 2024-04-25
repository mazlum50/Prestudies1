package dataTypes2;

public class ComparingStrings {
    public static void main(String[] args) {
        //1. Create both strings with a literal (e.g. String str1 = "Comparison"; ).

        String str1 = "Comparison";
        String str2 = "Comparison";
        // equals()
        System.out.println(" equals(): " + str1.equals(str2));
        // == Operator
        System.out.println(" == operator: " + (str1 == str2));

        //2. Create both strings with the constructor (e.g. String str = new String("Comparison"); ).
        String str3 = new String("Comparison");
        String str4 = new String("Comparison");

        // equals()
        System.out.println("equals(): " + str3.equals(str4)); // true

        // == Operator
        System.out.println(" == operator: " + (str3 == str4));


    }
}
