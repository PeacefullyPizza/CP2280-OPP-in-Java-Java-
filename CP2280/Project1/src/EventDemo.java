import java.util.Scanner;

public class EventDemo {
    public static void main(String[] args) {
        Event new_event = new Event();
        new_event.setNumber_of_guests(getguests());
        new_event.setEvent_ID(getEvent_ID());
        motto();
        price(new_event.getNumber_of_guests(), new_event.getEvent_ID());
    }
    public static int getguests() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many guests?: ");// prompt
        return input.nextInt();
    }

    public static String getEvent_ID(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Event ID: ");// prompt
        return input.nextLine();
    }

    public static void motto(){
        String motto = "*Marianne makes the food that makes it a party.*";
        System.out.println("************************************************");
        System.out.println(motto);
        System.out.println("************************************************");
    }
    public static void price( int guest_number, String new_event ){
        int total = guest_number * Event.PRICE_PER_GUEST;

        System.out.printf("Event Number: %s%n", new_event);
        System.out.printf("Number of guests: %d.00%n", guest_number);
        System.out.printf("Price per guest: %d.00%n", Event.PRICE_PER_GUEST);
        System.out.printf("Total price: $%d.00%n", total);
        if (guest_number >= Event.LARGE_EVENT_VALUE) {
            System.out.print("Large event?: true");
        } else {
            System.out.print("Large event?: false");
        }
    }
}

