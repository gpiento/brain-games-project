package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    /**
     * Count questing.
     */
    public static final int COUNT_QUEST = 3;
    /**
     * Range rnd numbers.
     */
    private static final int RANGE_NUMBER = 100;

    public static void run(String[] gameMessages, String[][] gameQuestions) {
        int countRound = 0;

        System.out.println(gameMessages[0]);

        while (countRound < COUNT_QUEST) {
            System.out.println("Question: " + gameQuestions[countRound][0]);
            System.out.print("Your answer: ");
            String answer = getAnswer();

            if (answer.equals(gameQuestions[countRound][1])) {
                System.out.println("Correct!");
                countRound++;
            } else {
                System.out.printf(gameMessages[1] + "\n", answer, gameQuestions[countRound][1]);
                System.out.println("Let's try again, "
                                   + Cli.getUserName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

    /**
     * random.
     *
     * @return int
     */
    @SuppressWarnings("checkstyle:MagicNumber")
    public static int randomNumber() {
        Random rnd = new Random();
        return rnd.nextInt(RANGE_NUMBER) + 1;
    }

    /**
     * getAnswer.
     *
     * @return input
     */
    public static String getAnswer() {
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        return input;
    }
}
