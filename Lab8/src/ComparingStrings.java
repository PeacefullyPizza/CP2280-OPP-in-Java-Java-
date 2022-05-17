import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        String s1, s2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:"); // Get first user string
        s1 = scan.nextLine();

        System.out.println("Enter the second string:"); // Get second user string
        s2 = scan.nextLine();

        if (s1.compareTo(s2) > 0) // Compare String1 to String2
            System.out.println("The first string is greater than the second.");
        else if (s1.compareTo(s2) < 0) // Compare String2 to String1
            System.out.println("The first string is smaller than the second.");
        else // Anything else String1 = String2
            System.out.println("Both the strings are equal.");

    }
}
