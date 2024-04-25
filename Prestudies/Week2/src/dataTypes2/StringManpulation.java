package dataTypes2;

import java.sql.SQLOutput;

public class StringManpulation {
    public static void main(String[] args) {
        String text = "Everybody said, it can’t be done. Then came one who did not know that and just made it";
        //1. Retrieve the two uppercase letters from the text
        System.out.println("1.");
        System.out.println("the two uppercase letters : " );
        for(int i = 0;i < text.length(); i++){
            if(Character.isUpperCase((text.charAt(i)))){
                System.out.println(text.charAt(i));
            }
        }
        //2. Compare the text with your name and interpret the result
        System.out.println("2.");
        String firstName = "Mazlum";
        System.out.println(text.compareTo(firstName));
        //3. Concatenate your first and last name
        System.out.println("3.");
        String lastName = "Ismail";
        System.out.println( text.concat(firstName)+" " + lastName);
        //4. Check if the words "made" and "Java" are present
        System.out.println("4.");
        System.out.println("Contains 'made': " + text.contains("made"));
        System.out.println("Contains 'Java': " + text.contains("Java"));
        //5. Compare two strings for equality
        System.out.println("5.");
        System.out.println("Texts are equal: " + text.equals(text.toUpperCase()));
        //6. Output the index of the first occurrence of "d"
        System.out.println("6.");
        System.out.println("Index of 'd': " + text.indexOf('d'));
        //7. Check for an empty string
        System.out.println("7.");
        System.out.println("Is empty: " + text.isEmpty());
        //8. Check a declared string for
        System.out.println("8.");
        System.out.println("Is null: " + text == null);
        //9. Output the length of the text
        System.out.println("9.");
        System.out.println("Length of text: " + text.length());
        //10. Extract the words "said" and "made
        System.out.println("10.");

        String firstWord = text.substring(text.indexOf("said"), text.indexOf("said") + "said".length());
        System.out.println("Extracted Said: " + firstWord);
        String secondWord = text.substring(text.indexOf("made"), text.indexOf("made") + "made".length());
        System.out.println("Extracted Said: " + secondWord);



    }
}
