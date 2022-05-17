public class Event {
    public final static int PRICE_PER_GUEST = 35;
    public final static int LARGE_EVENT_VALUE= 50;
    private String event_ID;
    private int number_of_guests;
    private int total;

    public void setEvent_ID(String event_ID) {
        this.event_ID = event_ID;
    }

    public void setNumber_of_guests(int number_of_guests) {
        this.number_of_guests = number_of_guests;
    }

    public int getTotal() {
        return total;
    }

    public int getNumber_of_guests() {
        return number_of_guests;
    }

    public String getEvent_ID() {
        return event_ID;
    }
}

