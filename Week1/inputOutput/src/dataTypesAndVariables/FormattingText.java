package dataTypesAndVariables;

import java.util.Scanner;

public class FormattingText {
    public static void main(String[] args) {
        //Scanner-Objekt erstellt
        Scanner scanner = new Scanner(System.in);
        //Aufforderung, Text einzugeben
        System.out.println("Enter a string: ");
        //Text in String speichen
        String text = scanner.nextLine();
        // Text in Wörter Aufteilen
        String [] words = text.split(" ");
        // Initialisieren Output
        StringBuilder output = new StringBuilder();
        // jede  Worte überprufen
        for (String word : words) {
            //  wörter mit"_"
            if (word.startsWith("_")&& word.endsWith("_")) {
                //bei "_"  Wort in Großbuchstaben
                output.append(word.substring(1, word.length() - 1).toUpperCase());
            }
            //  wörter mit"#"
         else if (word.startsWith("#") && word.endsWith("#")) {
            // Wort in Kleinbuchstaben
            output.append(word.substring(1, word.length() - 1).toLowerCase());
                //bei "#"  Wort in Kleinbuchstaben
        } else {
            // Unverändertes Wort
            output.append(word);
        }
            // Leerzeichen zwischen den Wörtern hinzufügen
        output.append(" ");
    }

    // Entfernen des abschließenden Leerzeichens
        System.out.println(output.toString().trim());
        }


}
