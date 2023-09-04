package hexlet.code;

import java.util.Random;

public class Utils {

    public static int generateNumber(final int min, final int max) {

        Random random = new Random();
        return random.nextInt(max) + 1 + min;
    }
}
