import java.util.Scanner;
public class ParkingCharges {
    public static void main ( String [] args) {
        Scanner input = new Scanner (System.in);
        double totalReceipts=0.0;
        double fee;
        double hours;

        System.out.print("Enter number of hours (a negative to quit): " );
        hours=input.nextDouble();

        while (hours >=0.0) {
            fee=calculateCharges(hours);
            totalReceipts += fee;
            System.out.printf("Current charge: %.2f, Total receipts: %.2f\n", fee, totalReceipts );
            System.out.print("Enter number of hours (a negative to quit)");
            hours=input.nextDouble();
        }
    }
    private static double calculateCharges(double hours) {
        double minPark= 2.0;
        double maxPark= 10.0;
        double maxHours= 24.0;
        double minHours= 3.0;
        double hourEx= 0.5;
        double fee;
        fee= 0;
        if ( hours <= minHours )
            fee = minPark;
        if ( hours > minHours && hours < maxHours )
            fee = 2.0 + hourEx*(hours - 3);
        if ( hours > 19 )
            fee = maxPark;
        return fee;
    }
}
