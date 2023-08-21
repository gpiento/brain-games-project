package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.COUNT_QUEST;
import static hexlet.code.Engine.randomNumber;

public final class Prime {

    private Prime() {
    }

    /**
     * game Prime.
     */
    public static void gamePrime() {

        String[] gameMessages = {
            "Answer 'yes' if given number is prime. Otherwise answer 'no'.",
            "'%s' is wrong answer ;(. Correct answer was '%s'."
        };

        String[][] gameQuestions = new String[COUNT_QUEST][2];

        for (int i = 0; i < COUNT_QUEST; i++) {
            int number = randomNumber();
            gameQuestions[i][0] = String.valueOf(number);
            gameQuestions[i][1] = isPrime(number) ? "yes" : "no";
        }

        Engine.run(gameMessages, gameQuestions);
    }

    public static boolean isPrime(int number) {
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
