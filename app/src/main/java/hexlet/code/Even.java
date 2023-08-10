package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public final class Even {
    /**
     * Count questing.
     */
    private static final int COUNT_QUEST = 3;

    /**
     * Range rnd.
     */
    private static final int RANGE = 100;

    private Even() {
    }

    /**
     * game Even.
     */
    public static void gameEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise"
                + " answer 'no'.");

        int count = 0;
        int numRnd;

        while (count < COUNT_QUEST) {
            numRnd = random();
            System.out.println("Question: " + numRnd);
            System.out.print("Your answer: ");
            String answer = getAnswer();
            if ((isEven(numRnd) && answer.equals("yes"))
                    || (!isEven(numRnd) && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '"
                        + (isEven(numRnd) ? "yes" : "no") + "'.");
                System.out.println("Let's try again, "
                        + Cli.getUserName() + "!");
                return;
            }
            count++;
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

    /**
     * getAnswer.
     * @return input
     */
    public static String getAnswer() {
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        return input;
    }

    /**
     * random.
     * @return int
     */
    @SuppressWarnings("checkstyle:MagicNumber")
    public static int random() {
        Random rnd = new Random();
        return rnd.nextInt(RANGE) + 1;
    }

    /**
     * isEven.
     * @param n number
     * @return boolean
     */
    public static boolean isEven(final int n) {
        return n % 2 == 0;
    }
}
