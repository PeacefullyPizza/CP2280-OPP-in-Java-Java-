import java.util.Scanner;

public class WorldPopGrowthCalc {
    public static void main(String[] args)
    {
        // Scanner to get inputs
        Scanner input = new Scanner( System.in );

        double currentPopulation;
        double yearOne;
        double yearTwo;
        double yearThree;
        double yearFour;
        double yearFive;
        float growthRate;

        System.out.print( "Please enter the current world population: "); //prompt
        currentPopulation = input.nextDouble();

        System.out.print( "Please enter the annual world population growth rate: "); //prompt
        growthRate = input.nextFloat();
        growthRate = growthRate / 100;

        yearOne = currentPopulation + ( currentPopulation * growthRate );
        System.out.printf( "\nWorld population after one year: %.0f\n", yearOne ); // Year 1 growth

        currentPopulation = yearOne;

        yearTwo = currentPopulation + ( currentPopulation * growthRate );
        System.out.printf( "                after two years: %.0f\n", yearTwo ); // Year 2 growth

        currentPopulation = yearTwo;

        yearThree = currentPopulation + ( currentPopulation * growthRate );
        System.out.printf( "              after three years: %.0f\n", yearThree ); // Year 3 growth

        currentPopulation = yearThree;

        yearFour = currentPopulation + ( currentPopulation * growthRate );
        System.out.printf( "               after four years: %.0f\n", yearFour ); // Year 4 growth

        currentPopulation = yearFour;

        yearFive = currentPopulation + ( currentPopulation * growthRate );
        System.out.printf( "               after five years: %.0f\n", yearFive ); // Year 5 growth
    }
}
