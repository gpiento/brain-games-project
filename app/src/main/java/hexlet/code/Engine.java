package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    private static final String MESSAGE_WRONG = "'%s' is wrong answer ;(. Correct answer was '%s'.";
    private static final int RANGE_NUMBER = 100;
    public static final int COUNT_QUEST = 3;

    public static void run(String gameMessages, String[][] gameQuestions) {

        System.out.println(gameMessages);

        for (int i = 0; i < COUNT_QUEST; i++) {
            System.out.println("Question: " + gameQuestions[i][0]);
            System.out.print("Your answer: ");
            String answer = getAnswer();

            if (answer.equals(gameQuestions[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf(MESSAGE_WRONG + "\n", answer, gameQuestions[i][1]);
                System.out.println("Let's try again, "
                                   + Cli.getUserName() + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

    public static int randomNumber() {
        Random rnd = new Random();
        return rnd.nextInt(RANGE_NUMBER) + 1;
    }

    private static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
