import java.util.Scanner;

public class AirlineReservationsSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean seats [] = new boolean[10];
        int firstClass = 0;
        int econClass = 0;
        int option;

        for(int count = 0; true;){
            System.out.print("Where would you like to be seated? (1 = First Class and 2 = Economy): ");
            option = input.nextInt();

            if(option == 1){
                if(firstClass <= 5){
                    seats[firstClass++] = true;
                    System.out.printf("Your seat number for First Class is: %d\n", firstClass);
                }
            }
            if(seats[econClass++] = false){
                System.out.print("Sorry, but first class is full.");
                if(econClass < 10){
                    System.out.print("Would you like to go to Economy? (1 = yes and 2 = no): ");
                    int selection = input.nextInt();
                    if(selection == 2){
                        seats[econClass++] = true;
                        System.out.printf("You have a seat in Economy which is seat: %d\n", econClass);
                    }
                    else
                        System.out.print("Next flight leaves in 3 hours!");
                    break;
                }
            }

            else if(option == 2){
                if(econClass < 10){
                    seats[econClass++] = true;
                    System.out.printf("Your seat number for Economy is: %d\n", econClass);
                }
            }
            if(seats[econClass++] = false){
                System.out.print("Sorry, but Economy is full.");
                if(firstClass <= 5){
                    System.out.print("Would you like to go to First Class? (1 = yes and 2 = no): ");
                    int selection = input.nextInt();
                    if(selection == 1){
                        seats[firstClass++] = true;
                        System.out.printf("You have a seat in First Class which is seat: %d\n", firstClass);
                    }
                    else
                        System.out.print("Next flight leaves in 3 hours!");
                }
            }
        }
    }
}