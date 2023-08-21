package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.COUNT_QUEST;
import static hexlet.code.Engine.randomNumber;

public final class Calc {
    /**
     * Range rnd operation.
     */
    private static final int RANGE_OPERATION = 3;

    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;

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

        String[][] gameQuestions = new String[COUNT_QUEST][2];

        for (int i = 0; i < COUNT_QUEST; i++) {
            int number1 = randomNumber();
            int number2 = randomNumber();
            StringBuilder quest = new StringBuilder();
            quest.append(number1).append(" ");

            switch (randomOperation()) {
                case ADDITION -> {
                    quest.append("+");
                    gameQuestions[i][1] = String.valueOf(number1 + number2);
                }
                case SUBTRACTION -> {
                    quest.append("-");
                    gameQuestions[i][1] = String.valueOf(number1 - number2);
                }
                case MULTIPLICATION -> {
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
