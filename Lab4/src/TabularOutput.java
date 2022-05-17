public class TabularOutput {
    public static void main(String[] args) {
        int Counter = 1; // initialize counter
        System.out.println("N\t\t10*N\t\t100*N\t\t1000*N"); // display first line of output
        while ( Counter <= 5 ) {
            // use counter to print first digit, add zeros to complete number
            System.out.printf("%d\t\t%d0\t\t\t%d00\t\t\t%d000\n", Counter, Counter, Counter, Counter);
            Counter++;
        }
    }
}
