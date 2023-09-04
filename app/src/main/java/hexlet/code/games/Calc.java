package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.COUNT_QUEST;
import static hexlet.code.Utils.generateNumber;

public final class Calc {

    private static final int RANGE_OPERATION = 3;
    private static final int RANGE_NUMBER = 100;
    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    private static final String RULE_GAME = "What is the result of the expression?";

    public static void gameCalc() {

        String[][] gameQuestions = new String[COUNT_QUEST][2];

        for (int i = 0; i < COUNT_QUEST; i++) {
            makeQuest(gameQuestions, i);
        }

        Engine.run(RULE_GAME, gameQuestions);
    }

    public static void makeQuest(String[][] gameQuestions, int i) {
        int number1 = generateNumber(0, RANGE_NUMBER);
        int number2 = generateNumber(0, RANGE_NUMBER);
        StringBuilder questString = new StringBuilder();
        int operator = Utils.generateNumber(0, RANGE_OPERATION);

        questString.append(number1);
        questString.append(selectOperation(operator));
        questString.append(number2);
        gameQuestions[i][0] = questString.toString();
        gameQuestions[i][1] = String.valueOf(calcAnswer(number1, number2, operator));
    }

    public static String selectOperation(int operator) {
        switch (operator) {
            case ADDITION -> {
                return " + ";
            }
            case SUBTRACTION -> {
                return " - ";
            }
            case MULTIPLICATION -> {
                return " * ";
            }
            default ->
                    throw new IllegalArgumentException("Неподдерживаемая операция.");
        }
    }

    public static int calcAnswer(int number1, int number2, int operator) {
        switch (operator) {
            case ADDITION -> {
                return number1 + number2;
            }
            case SUBTRACTION -> {
                return number1 - number2;
            }
            case MULTIPLICATION -> {
                return number1 * number2;
            }
            default ->
                    throw new IllegalArgumentException("Неподдерживаемая операция.");
        }
    }

}
