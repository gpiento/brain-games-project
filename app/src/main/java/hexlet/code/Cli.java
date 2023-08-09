package hexlet.code;

import java.util.Scanner;

public final class Cli {

    private Cli() {
    }

    /**
     * Method greetingUser().
     */
    public static void greetingUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}
