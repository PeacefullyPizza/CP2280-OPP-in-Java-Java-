import java.util.Scanner;

public class MariannesEventPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many guests?: "); // prompt
        int guests = input.nextInt();
        double total = guests * 35;
        double price = 35;
        System.out.printf("Marianne makes the food that makes it a party.%n");
        System.out.printf("The number of guests: %d%n" +
                "Price per guest: $%.2f%n" +
                "Total is: $%.2f%n", guests, price, total);
        if (guests >= 50) {
            System.out.print("Large event?: True");
        } else {
            System.out.print("Large event?: False");
        }
    }
}



