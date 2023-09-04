package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.COUNT_QUEST;
import static hexlet.code.Utils.generateNumber;

public final class Prime {

    private static final int RANGE_NUMBER = 100;
    private static final String RULE_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void gamePrime() {

        String[][] gameQuestions = new String[COUNT_QUEST][2];

        for (int i = 0; i < COUNT_QUEST; i++) {
            int number = generateNumber(0, RANGE_NUMBER - 1) + 1;
            gameQuestions[i][0] = String.valueOf(number);
            gameQuestions[i][1] = isPrime(number) ? "yes" : "no";
        }

        Engine.run(RULE_GAME, gameQuestions);
    }

    public static boolean isPrime(final int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
