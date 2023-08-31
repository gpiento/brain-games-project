package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.COUNT_QUEST;
import static hexlet.code.Utils.numberGenerator;

public final class Even {

    private static final String RULE_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void gameEven() {

        String[][] gameQuestions = new String[COUNT_QUEST][2];

        for (int i = 0; i < COUNT_QUEST; i++) {
            int number = numberGenerator();
            gameQuestions[i][0] = String.valueOf(number);
            gameQuestions[i][1] = isEven(number) ? "yes" : "no";
        }

        Engine.run(RULE_GAME, gameQuestions);
    }

    public static boolean isEven(final int n) {

        return n % 2 == 0;
    }
}
