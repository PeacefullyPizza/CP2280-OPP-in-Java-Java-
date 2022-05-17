import java.util.Scanner;
public class LargestNumber {
    public static void main( String[] args ) {
        Scanner input = new Scanner ( System.in );
        int Counter = 1;
        int Number = 0;
        int Largest = 0;

        while ( Counter <= 10 ) { // counter up to 10
            System.out.printf( "Please insert number %d: ", Counter); // prompt
            Number = input.nextInt();
            if (Number > Largest) { // compare number
                Largest = Number;
            }
            Counter++;
        }
        System.out.printf("The largest number is: %d\n", Largest); // display largest number
    }
}