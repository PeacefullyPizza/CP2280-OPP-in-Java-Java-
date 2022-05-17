/*Write an application to simulate the rolling of two dice. The application should use an object of
class Random once to roll the first die and again to roll the second die. The sum of the two values
should then be calculated. Each die can show an integer value from 1 to 6, so the sum of the values will
vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the least frequent. Figure 7.28 shows the
36 possible combinations of the two dice. Your application should roll the dice 36,000,000 times. Use a
one-dimensional array to tally the number of times each possible sum appears. Display the results in tabular format.*/

import java.security.SecureRandom;

public class DiceRolling {
    private static final SecureRandom RandomRoll = new SecureRandom();

    public static void main(String[] args) {
        int[] frequency = new int[13];

        for (int i = 0; i < 36_000_000; i++) {
            int Die1 = 1 + RandomRoll.nextInt(6);
            int Die2 = 1 + RandomRoll.nextInt(6);

            int Sum = Die1 + Die2;

            ++frequency[Sum];
        }

        System.out.printf("%s %s%n", "Sum", "Frequency");

        for (int i = 2; i < frequency.length; i++) {
            System.out.printf("%2d %10d%n", i, frequency[i]);
        }
    }
}

