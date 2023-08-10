package hexlet.code;

import java.util.Scanner;

public final class Cli {
    /**
     * userName.
     */
    private static String userName;

    private Cli() {
    }

    /**
     * greetUser.
     */
    public static void greetingUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setUserName(scanner.nextLine());
        System.out.println("Hello, " + getUserName() + "!");
    }

    /**
     * getUserName.
     * @return userName
     */
    public static String getUserName() {
        return userName;
    }

    /**
     * setUserName.
     * @param name user
     */
    public static void setUserName(final String name) {
        Cli.userName = name;
    }
}
