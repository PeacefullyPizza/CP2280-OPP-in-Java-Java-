import java.util.Scanner;

public class MariannesEventPriceWithMethods {
    public static void main(String[] args) {
        int guests_amount = getguests();
        motto();
        price(guests_amount);
    }
    public static int getguests() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many guests?: ");// prompt
        return input.nextInt();
    }
    public static void motto(){
        String motto = "*Marianne makes the food that makes it a party.*";
        System.out.println("************************************************");
        System.out.println(motto);
        System.out.println("************************************************");
    }
    public static void price( int guest_number ){
        int totalprice = guest_number * 35;

        System.out.printf("The price is: $%d%n", totalprice);
        if (guest_number >= 50) {
            System.out.print("Large event?: True");
        } else {
            System.out.print("Large event?: False");
        }
    }
}

