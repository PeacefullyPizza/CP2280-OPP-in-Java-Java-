/* Write an application that reads a date in the first format and prints it
in the second format.
04/25/1955 and April 25, 1955
*/
import java.util.Scanner;

public class PrintingDates {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("\nThis application will change the format of the user entered date");
        System.out.println("\nPlease enter the date(MM/DD/YYYY) you would like to have formatted:\nEnter date: ");

        String UserDate = UserInput.nextLine();
        String [] token = UserDate.split("/");
        String Month = token[0];

        String MonthName = switch (Month) {
case "1", "01" -> "January";
case "2", "02" -> "February";
case "3", "03" -> "March";
case "4", "04" -> "April";
case "5", "05" -> "May";
case "6", "06"-> "June";
case "7", "07" -> "July";
case "8", "08" -> "August";
case "9", "09" -> "September";
case "10" -> "October";
case "11" -> "November";
case "12" -> "December";
            default -> "Not a valid format of date";
        };
        System.out.printf("\nThe formatted date is now: \n%s %s, %s", MonthName, token[1], token[2]);
    }
}
