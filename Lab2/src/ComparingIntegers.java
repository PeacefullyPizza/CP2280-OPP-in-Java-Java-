import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args)
    {
        // Scanner to get inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); //prompt
        int number1 = input.nextInt();

        System.out.print("Enter second integer: "); //prompt
        int number2 = input.nextInt();

        if (number1 == number2) //equals to
            System.out.printf("These numbers are equal %d , %d%n", number1, number2);

        if (number1 < number2) { //number 1 is smaller
            System.out.printf("%d is Larger %d", number1, number2);
        }
        if (number1 > number2) { //number 2 is larger
            System.out.printf("%d is Larger %d", number1, number2);
        }
    }
}


