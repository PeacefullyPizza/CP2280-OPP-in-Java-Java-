public enum TrafficLight {
    GREEN(50),
    YELLOW(10),
    RED(60);

    private final int duration;

    TrafficLight( int durationSeconds ){
        duration = durationSeconds;
    }
    public int getDuration(){
        return duration;
    }
}
