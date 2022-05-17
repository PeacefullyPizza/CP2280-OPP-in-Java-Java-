package com.johnmilley.cp2280;

import java.util.Scanner;

public class EventDemo {

    public static void main(String[] args) {
        // create event object
        Event event = new Event();

        // set guests and id through getters (we haven't coded a constructor yet)
	    event.setGuests(getNumberOfGuests());
        event.setEventID(getEventID());

        // output the motto followed by the event total
        displayCompanyMotto();
        displayEventInfo(event);
    }

    public static int getNumberOfGuests() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of guests: ");
        return input.nextInt();
    }

    public static String getEventID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter event ID: ");
        return input.next();
    }

    public static void displayCompanyMotto() {
        // motto
        System.out.println("**************************************************");
        System.out.println("* Marianne makes the food that makes it a party. *");
        System.out.println("**************************************************");
    }

    public static void displayEventInfo(Event event) {
        boolean isLargeEvent = event.getGuests() >= Event.CUT_OFF_VALUE;

        System.out.printf("Event Number: %s\n", event.getEventID());
        System.out.printf("Number of guests: %d\n", event.getGuests());
        System.out.printf("Price per guest: %.2f\n", Event.PRICE_PER_GUEST);
        System.out.printf("Total price: %.2f\n", event.getGuests() * Event.PRICE_PER_GUEST);
        System.out.println("Large event: " + isLargeEvent);
    }

}
