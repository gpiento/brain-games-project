package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.COUNT_QUEST;
import static hexlet.code.Engine.randomNumber;

public final class GCD {

    private static final String RULE_GAME = "Find the greatest common divisor of given numbers.";

    public static void gameGCD() {

        String[][] gameQuestions = new String[COUNT_QUEST][2];

        for (int i = 0; i < COUNT_QUEST; i++) {
            int number1 = randomNumber();
            int number2 = randomNumber();

            gameQuestions[i][0] = number1 + " " + number2;
            gameQuestions[i][1] = String.valueOf(gcd(number1, number2));
        }

        Engine.run(RULE_GAME, gameQuestions);
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
