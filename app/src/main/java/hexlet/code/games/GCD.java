package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.randomNumber;

public final class GCD {

    private GCD() {
    }

    /**
     * game Even.
     */
    public static void gameGCD() {

        String[] gameMessages = {
            "Find the greatest common divisor of given numbers.",
            "'%s' is wrong answer ;(. Correct answer was '%s'."
        };

        String[][] gameQuestions = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int number1 = randomNumber();
            int number2 = randomNumber();

            gameQuestions[i][0] = number1 + " " + number2;
            gameQuestions[i][1] = String.valueOf(gcd(number1, number2));
        }

        Engine.run(gameMessages, gameQuestions);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
