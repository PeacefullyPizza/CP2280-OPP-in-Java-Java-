public class EnumTest {
    public static void main(String[] args) {
        System.out.println( "Light\tDuration\n" );
        for ( TrafficLight light : TrafficLight.values() )
            System.out.printf( "%-5s\t%d\n", light , light.getDuration());
    }
}
