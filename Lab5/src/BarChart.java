import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        System.out.printf("Enter 5 numbers between 1 and 30:%n"); //prompt
        Scanner input = new Scanner(System.in);
        int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0; // set numbers
        int inputnumber, counter = 1; // set input number && counter
        while (counter <= 5) {
            inputnumber = input.nextInt();
            if (inputnumber >= 1 && inputnumber <= 30) {  // range of 1 to 30
                switch (counter) {
                    case 1:
                        number1 = inputnumber;
                        break;
                    case 2:
                        number2 = inputnumber;
                        break;
                    case 3:
                        number3 = inputnumber;
                        break;
                    case 4:
                        number4 = inputnumber;
                        break;
                    case 5:
                        number5 = inputnumber;
                        break;
                }
                counter++;
            } else {
                System.out.println("Please enter a number between 1 - 30");
            }
        }
        int value = 0; // set value
        for (counter = 1; counter <= 5; counter++) { // range of 1 to 5
            switch (counter) {
                case 1:
                    value = number1;
                    break;
                case 2:
                    value = number2;
                    break;
                case 3:
                    value = number3;
                    break;
                case 4:
                    value = number4;
                    break;
                case 5:
                    value = number5;
                    break;
            }
            for (int j = 1; j <= value; j++) {
                System.out.print("*");
            }
            {
                System.out.println();
            }
        }
    }
}



