import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        Rectangle rectangle = new Rectangle();
        int choice = getMenuChoice();
        while ( choice != 3 )
            {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Please enter length: ");
                        rectangle.setLength(input.nextDouble());
                    }
                    case 2 -> {
                        System.out.print("Please enter width: ");
                        rectangle.setWidth(input.nextDouble());
                    }
                }
                System.out.println (rectangle);
            choice = getMenuChoice();
            }
        }
        private static int getMenuChoice() {
        Scanner input = new Scanner( System.in );
        System.out.println( "\nSet Length = 1" );
        System.out.println( "Set Width = 2" );
        System.out.println( "Exit = 3" );
        System.out.print( "Choice Picked: \n" );
        return input.nextInt();
        }
}

