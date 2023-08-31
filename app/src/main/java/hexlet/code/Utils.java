package hexlet.code;

import java.util.Random;

public class Utils {

    private static final int RANGE_NUMBER = 100;

    public static int numberGenerator(final int min, final int max) {

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int numberGenerator(final int max) {

        return numberGenerator(0, max - 1) + 1;
    }

    public static int numberGenerator() {

        return numberGenerator(0, RANGE_NUMBER - 1) + 1;
    }
}
