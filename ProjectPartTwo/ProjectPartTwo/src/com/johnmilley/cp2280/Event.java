package com.johnmilley.cp2280;

public class Event {
    // all caps, words separated by _ is the convention for constants
    public final static double REGULAR_PRICE_PER_GUEST = 35.00;
    public final static double DISCOUNTED_PRICE_PER_GUEST = 32.00;
    public final static int LARGE_EVENT_CUTOFF = 50;

    private String eventID = "";
    private int guests = 0;
    private double pricePerGuest = 0.0;
    private double total = 0.0;

    public Event() {
        this("A000", 0);
    }

    public Event(String eventID, int guests) {
        setEventID(eventID);
        setGuests(guests);
    }

    public boolean isLargeEvent() {
        return guests >= LARGE_EVENT_CUTOFF;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public void setGuests(int guests) {
        this.guests = guests;
        pricePerGuest = isLargeEvent() ? DISCOUNTED_PRICE_PER_GUEST : REGULAR_PRICE_PER_GUEST;
        total = pricePerGuest * guests;
    }

    public String getEventID() {
        return eventID;
    }

    public int getGuests() {
        return guests;
    }

    public double getPricePerGuest() {
        return pricePerGuest;
    }

    public double getTotal() {
        return total;
    }

}
