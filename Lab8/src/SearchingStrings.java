/*14.11 (Searching Strings) Write an application that inputs a line
of text and a search character and uses String method indexOf to
determine the number of occurrences of the character in the text.*/

import java.util.Scanner;
public class SearchingStrings {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("\nThis application will determine the number of occurrences of the " +
                "user submitted character in the user submitted sentence "); // Display application info
        System.out.println("\nEnter a sentence: "); // Get user sentence
        String UserSentence =  UserInput.nextLine(); // Read user input and create String
        System.out.println("\nEnter a character to search for: "); // Get user sentence
        String CharacterSearch = UserInput.nextLine();

        UserSentence = UserSentence.toLowerCase(); // Turn all characters to Lower Case
        CharacterSearch = CharacterSearch.toLowerCase();
        boolean search = true;
        int index = -1; // Set Index to -1
        int count = 0; // Set Count to 0
        while (search) {
            index = UserSentence.indexOf(CharacterSearch, index + 1); // Search for user Character
            if (index == -1) {
                search = false;
            } else {
                count++;
            }
        }
        System.out.printf("Your character: %s, is shown %d times", CharacterSearch, count); // Display the number of occurrences of letter "t"
        }
    }
