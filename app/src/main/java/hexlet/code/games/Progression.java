package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.COUNT_QUEST;

public final class Progression {

    public static final int MIN_START_CHAIN = 5;
    public static final int MAX_START_CHAIN = 20;
    public static final int MIN_STEP_CHAIN = 2;
    public static final int MAX_STEP_CHAIN = 8;
    public static final int MIN_COUNT_ELEMENTS = 5;
    public static final int MAX_COUNT_ELEMENTS = 12;

    private Progression() {
    }

    /**
     * game Progression.
     */
    public static void gameProgression() {

        String[] gameMessages = {
            "What number is missing in the progression?",
            "'%s' is wrong answer ;(. Correct answer was '%s'."
        };

        String[][] gameQuestions = new String[COUNT_QUEST][2];

        for (int i = 0; i < 3; i++) {
            int startChain = numGen(MIN_START_CHAIN, MAX_START_CHAIN);
            int stepChain = numGen(MIN_STEP_CHAIN, MAX_STEP_CHAIN);
            int countElements = numGen(MIN_COUNT_ELEMENTS, MAX_COUNT_ELEMENTS);
            int numberQuest = numGen(1, countElements - 1);
            StringBuilder quest = new StringBuilder();

            quest.append(startChain).append(" ");
            for (int j = 1; j < countElements; j++) {
                startChain += stepChain;
                if (j == numberQuest) {
                    quest.append("..");
                    gameQuestions[i][1] = String.valueOf(startChain);
                } else {
                    quest.append(startChain);
                }
                quest.append(" ");
            }
            gameQuestions[i][0] = quest.toString();
        }

        Engine.run(gameMessages, gameQuestions);
    }

    public static int numGen(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
