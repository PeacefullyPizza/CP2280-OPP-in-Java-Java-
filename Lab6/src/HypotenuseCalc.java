import java.util.Scanner;

public class HypotenuseCalc {
    public static double side1;
    public static double side2;
    public static double hypotenuse() {
        return Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter Side1 number: " );
        side1=input.nextDouble();
        System.out.print("Enter Side2 number: " );
        side2=input.nextDouble();
        System.out.printf("The Hypotenuse is %.2f",hypotenuse());

    }
}
