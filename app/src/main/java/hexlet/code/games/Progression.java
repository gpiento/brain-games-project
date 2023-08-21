package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Progression {

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

        String[][] gameQuestions = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int startChain = numGen(5, 20);
            int stepChain = numGen(2, 8);
            int countElements = numGen(5, 12);
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
