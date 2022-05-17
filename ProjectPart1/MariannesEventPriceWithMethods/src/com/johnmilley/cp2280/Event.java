package com.johnmilley.cp2280;

public class Event {
    public final static double PRICE_PER_GUEST = 35.00;
    public final static int CUT_OFF_VALUE = 50;

    private String eventID = "";
    private int guests = 0;
    private double total = 0.0;

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public void setGuests(int guests) {
            this.guests = guests;
            total = PRICE_PER_GUEST * guests;
    }

    public String getEventID() {
        return eventID;
    }

    public int getGuests() {
        return guests;
    }

    public double getTotal() {
        return total;
    }
}
