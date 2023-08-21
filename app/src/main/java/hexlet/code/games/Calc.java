package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.randomNumber;

public final class Calc {
    /**
     * Range rnd operation.
     */
    private static final int RANGE_OPERATION = 3;

    private Calc() {
    }

    /**
     * game Calc.
     */
    public static void gameCalc() {

        String[] gameMessages = {
            "What is the result of the expression?",
            "'%s' is wrong answer ;(. Correct answer was '%s'."
        };

        String[][] gameQuestions = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int number1 = randomNumber();
            int number2 = randomNumber();
            StringBuilder quest = new StringBuilder();
            quest.append(number1).append(" ");

            switch (randomOperation()) {
                case 1 -> {
                    quest.append("+");
                    gameQuestions[i][1] = String.valueOf(number1 + number2);
                }
                case 2 -> {
                    quest.append("-");
                    gameQuestions[i][1] = String.valueOf(number1 - number2);
                }
                case 3 -> {
                    quest.append("*");
                    gameQuestions[i][1] = String.valueOf(number1 * number2);
                }
                default -> {
                }
            }

            quest.append(" ").append(number2);
            gameQuestions[i][0] = quest.toString();
        }

        Engine.run(gameMessages, gameQuestions);
    }

    /**
     * random operation.
     *
     * @return int
     */
    @SuppressWarnings("checkstyle:MagicNumber")
    public static int randomOperation() {
        Random rnd = new Random();
        return rnd.nextInt(RANGE_OPERATION) + 1;
    }
}
