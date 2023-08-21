package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.randomNumber;
import static hexlet.code.Engine.randomOperation;

public final class Calc {

    private Calc() {
    }

    /**
     * game Even.
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
}
