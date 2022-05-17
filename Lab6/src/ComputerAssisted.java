import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssisted {
    public static void main(String[] args) {
        while (generateQuestion()) {
            generateQuestion();
        }
    }

    public static boolean generateQuestion() {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        String[] correct_responses = {
                "Very good!",
                "Excellent!",
                "Nice work!",
                "Keep up the good work!"};
        String[] incorrect_responses = {
                "No. Please try again.",
                "Wrong. Try once more.",
                "Don’t give up!",
                "No. Keep trying."
        };
        int correct_messages = random.nextInt(correct_responses.length);
        String random_correct_message = correct_responses[correct_messages];

        int incorrect_messages = random.nextInt(incorrect_responses.length);
        String random_incorrect_message = incorrect_responses[incorrect_messages];
        int integer1 = 1 + random.nextInt(9);
        int integer2 = 1 + random.nextInt(9);

        System.out.printf("How much is %d times %d? ", integer1, integer2);
        int user_answer = input.nextInt();

        while (user_answer != integer1 * integer2) {
            System.out.print(random_incorrect_message);
            System.out.println();
            user_answer = input.nextInt();
        }
        System.out.print(random_correct_message);
        System.out.println();
        return true;
    }
}



