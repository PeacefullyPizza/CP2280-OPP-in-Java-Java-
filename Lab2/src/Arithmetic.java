import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args)
    {
        // Scanner to get inputs
        Scanner input = new Scanner(System.in);

        System.out.println("This program determines the sum, product, difference, and quotient of two integers" +
                "\nPlease enter the first integer: "); // description + prompt
        int userInput1 = input.nextInt(); // integer 1

        System.out.println("\nPlease enter the second integer: "); //prompt
        int userInput2 = input.nextInt(); // integer 2

        // Sum of both integers
        // \033[3m can add italics to display text!
        int sum = userInput1 + userInput2;
        System.out.printf("\n\033[3mThe Sum is %d%n", sum); // display result

        // Product of both integers
        int product = userInput1 * userInput2;
        System.out.printf("\033[3mThe Product is %d%n", product); // display result

        // Difference of both integers
        int difference = userInput1 - userInput2;
        System.out.printf("\033[3mThe Difference is %d%n", difference); // display result

        // Quotient of both integers
        int quotient = userInput1 / userInput2;
        System.out.printf("\033[3mThe Quotient is %d%n", quotient); // display result
    }
}
