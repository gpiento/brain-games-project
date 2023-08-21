package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.randomNumber;

public final class Even {

    private Even() {
    }

    /**
     * game Even.
     */
    public static void gameEven() {

        String[] gameMessages = {
            "Answer 'yes' if the number is even, otherwise answer 'no'.",
            "'%s' is wrong answer ;(. Correct answer was '%s'."
        };

        String[][] gameQuestions = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int number = randomNumber();
            gameQuestions[i][0] = String.valueOf(number);
            gameQuestions[i][1] = isEven(number) ? "yes" : "no";
        }

        Engine.run(gameMessages, gameQuestions);
    }

    /**
     * isEven.
     *
     * @param n number
     * @return boolean
     */
    public static boolean isEven(final int n) {
        return n % 2 == 0;
    }
}
