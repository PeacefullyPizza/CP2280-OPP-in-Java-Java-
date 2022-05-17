package com.johnmilley.cp2280;

import java.util.Scanner;

public class EventDemo {

    public static void main(String[] args) {
        Event event1 = createEvent();
        Event event2 = createEvent();
        Event event3 = createDefaultEvent();

        // testing largestEvent method
        System.out.println("");
        System.out.println("Comparison of events 1 and 2");
        System.out.println("------------");
        System.out.printf("event1: %s %d\n", event1.getEventID(), event1.getGuests());
        System.out.printf("event2: %s %d\n", event2.getEventID(), event2.getGuests());
        Event largest = largestEvent(event1, event2);
        System.out.printf("Largest event: %s %d\n", largest.getEventID(), largest.getGuests());
        System.out.println("");

        // output the motto followed by the event total
        displayCompanyMotto();

        System.out.println("Details of the 3 events created above:");
        displayEventInfo(event1);
        displayEventInfo(event2);
        displayEventInfo(event3);
    }

    public static Event createDefaultEvent() {
        Event event = new Event();
        return event;
    }

    public static Event createEvent() {
        Event event = new Event(getEventID(), getNumberOfGuests());
        return event;
    }

    public static String getEventID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter event ID: ");
        return input.next();
    }

    public static int getNumberOfGuests() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of guests: ");
        int guests = input.nextInt();
        while (guests < 5 || guests > 100) {
            System.out.println("Number of guests must be no fewer than 5, nor greater than 100.");
            System.out.print("Enter number of guests: ");
            guests = input.nextInt();
        }
        return guests;
    }

    public static Event largestEvent(Event e1, Event e2) {
        // compares guests, returns e1 if larger, e2 if smaller or equal
        return e1.getGuests() > e2.getGuests() ? e1 : e2;
    }

    public static void displayCompanyMotto() {
        // motto
        System.out.println("**************************************************");
        System.out.println("* Marianne makes the food that makes it a party. *");
        System.out.println("**************************************************");
    }

    public static void displayEventInfo(Event event) {
        System.out.printf("Event Number: %s\n", event.getEventID());
        System.out.printf("Number of guests: %d\n", event.getGuests());
        System.out.printf("Price per guest: %.2f\n", event.getPricePerGuest());
        System.out.printf("Total price: %.2f\n", event.getTotal());
        System.out.println("Large event: " + event.isLargeEvent());
        System.out.println("");
    }
}