import java.util.Scanner;
public class GasMileage { public void inputTripInfo()
{
    Scanner input = new Scanner( System.in ); // scanner

    int miles = 0;
    int gallons = 0;
    double mpg = 0.0;
    int total_miles = 0;
    int total_gallons = 0;
    double total_mpg = 0.0;
    int trips = 0;

    System.out.print( "Please enter Trip 1 Mileage (as an Integer) or -1 to quit: "); // prompt
    miles = input.nextInt();
    if ( miles != -1 )
    {
        System.out.print( "Please enter Trip 1 Gallons (as an Integer): "); // prompt
        gallons = input.nextInt();
        trips++;
    }

    // loop until sentinel value read from user
    while ( miles != -1 )
    {
        total_miles += miles; // add miles
        total_gallons += gallons; // add gallons
        total_mpg = (double) total_miles / total_gallons; // total mpg

        mpg = (double) miles / gallons;

        System.out.printf( "Trip %d's mpg (miles per gallon) is: %.1f\n", trips, mpg ); // display miles/gallon

        if ( trips > 1 )
        {
            System.out.printf( "\nTotal miles of your %d trips is: %d\n", trips, total_miles ); // display total miles
            System.out.printf( "Total gallons of your %d trips is: %d\n", trips, total_gallons ); // display total gallons
            System.out.printf( "Combined mpg of your %d trips is: %.1f\n", trips, total_mpg ); // display total mpg
        }

        // Prompt the user for the next trip miles (possibly the sentinel)
        trips++;
        System.out.printf( "\nEnter trip %d mileage (as integer) or -1 to quit: ", trips ); // prompt
        miles = input.nextInt();
        if ( miles != -1 )
        {
            System.out.printf( "Enter trip %d gallons (as integer): ", trips ); // prompt
            gallons = input.nextInt();
        }
    }

    if ( total_miles != 0 ) // if miles is 0 display else
    {
        System.out.printf( "\nFinal total miles driven is: %d\n", total_miles ); // display final miles total
        System.out.printf( "Final total gallons used is: %d\n", total_gallons ); // display final gallon total
        System.out.printf( "Final combined MPG is: %.1f\n\n", total_mpg ); // display final mpg total
    }
    else
        System.out.println( "No trip information was entered.\n\n" ); // display if not information is entered!
}
}

