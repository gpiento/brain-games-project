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
    private static final String RULE_GAME = "What number is missing in the progression?";

    public static void gameProgression() {

        String[][] gameQuestions = new String[COUNT_QUEST][2];

        for (int i = 0; i < COUNT_QUEST; i++) {
            int startChain = numberGenerator(MIN_START_CHAIN, MAX_START_CHAIN);
            int stepChain = numberGenerator(MIN_STEP_CHAIN, MAX_STEP_CHAIN);
            int countElements = numberGenerator(MIN_COUNT_ELEMENTS, MAX_COUNT_ELEMENTS);

            int[] chainProgression = generateProgression(startChain, stepChain, countElements);
            int numberQuest = numberGenerator(1, chainProgression.length - 1);

            StringBuilder questString = new StringBuilder();

            for (int j = 0; j < chainProgression.length; j++) {
                if (j == numberQuest) {
                    questString.append("..");
                    gameQuestions[i][1] = String.valueOf(chainProgression[j]);
                } else {
                    questString.append(chainProgression[j]);
                }
                questString.append(" ");
            }
            gameQuestions[i][0] = questString.toString();
        }

        Engine.run(RULE_GAME, gameQuestions);
    }

    private static int[] generateProgression(int startChain, int stepChain, int countElements) {
        int[] chain = new int[countElements];

        chain[0] = startChain;

        for (int i = 1; i < chain.length; i++) {
            chain[i] = chain[i - 1] + stepChain;
        }
        return chain;
    }

    public static int numberGenerator(final int min, final int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
