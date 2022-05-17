/*14.9 (Displaying a Sentence with Its Words Reversed) Write
an application that inputs a line of text, tokenizes the line with
String method split and outputs the tokens in reverse order. Use
space characters as delimiters.*/
import java.util.Scanner;
public class ReversedWords {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter a sentence to be shown in reverse: "); // Get user sentence
        String UserSentence =  UserInput.nextLine();
        String[] token = UserSentence.split(" "); // Spilt
        StringBuilder ReversedSentence = new StringBuilder(); // User sentence to reverse

        for(int i = token.length-1; i >= 0; i--)
        {
            ReversedSentence.append(token[i]);
            if (i != 0) { ReversedSentence.append(" "); }
        }
        System.out.print(ReversedSentence); // Display user sentence in reverse
        }
    }

