import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args)
    {
        // Scanner to get inputs
        Scanner input = new
                Scanner(System.in);
        //prompt
        System.out.println("This program determines if an integer is odd or even. \nPlease enter an integer: ");
        int userInput = input.nextInt();

        if (userInput % 2 == 0) {
            System.out.printf("The integer %d is even.", userInput); //output for even
        }
            else {
                System.out.printf("The integer %d is odd.", userInput); //output for odd
        }
    }
}
