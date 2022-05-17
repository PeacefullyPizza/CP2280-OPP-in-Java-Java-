/* 14.14 (Tokenizing and Comparing Strings) Write an
application that reads a line of text, tokenizes it using space characters
as delimiters and outputs only those words ending with the letters
"ED". */

import java.util.Scanner;

public class Tokenizing {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in); // Start Scanner
        System.out.println();
        System.out.println("This application will determine the words " +
                "ending in *ed* from the user submitted sentence\n");

        System.out.print("Enter a sentence: \n"); // Display input
        String UserSentence = UserInput.nextLine(); // Read user sentence

        UserSentence = UserSentence.toLowerCase(); // Change all characters to lowercase in user sentence
        String[] token = UserSentence.split(" "); // Tokenize using space as delimiters

        StringBuilder WordsEndingED = new StringBuilder();
        for (String word : token) {
            if ((word).endsWith("ed")) {
                WordsEndingED.append("\n*: ").append(word);
            }
        }
        System.out.println("\nThe words ending in *ed* are: " + WordsEndingED);
    }
}
