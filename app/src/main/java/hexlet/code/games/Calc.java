package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.COUNT_QUEST;
import static hexlet.code.Engine.randomNumber;

public final class Calc {

    private static final int RANGE_OPERATION = 3;
    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    private static final String RULE_GAME = "What is the result of the expression?";

    public static void gameCalc() {

        String[][] gameQuestions = new String[COUNT_QUEST][2];

        for (int i = 0; i < COUNT_QUEST; i++) {
            int number1 = randomNumber();
            int number2 = randomNumber();
            StringBuilder questString = new StringBuilder();
            questString.append(number1).append(" ");

            switch (randomOperation()) {
                case ADDITION -> {
                    questString.append("+");
                    gameQuestions[i][1] = String.valueOf(number1 + number2);
                }
                case SUBTRACTION -> {
                    questString.append("-");
                    gameQuestions[i][1] = String.valueOf(number1 - number2);
                }
                case MULTIPLICATION -> {
                    questString.append("*");
                    gameQuestions[i][1] = String.valueOf(number1 * number2);
                }
                default -> {
                    throw new IllegalArgumentException("Неподдерживаемая операция.");
                }
            }

            questString.append(" ").append(number2);
            gameQuestions[i][0] = questString.toString();
        }

        Engine.run(RULE_GAME, gameQuestions);
    }

    public static int randomOperation() {
        Random rnd = new Random();
        return rnd.nextInt(RANGE_OPERATION) + 1;
    }
}
