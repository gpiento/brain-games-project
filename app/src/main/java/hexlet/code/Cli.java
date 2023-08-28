package hexlet.code;

import java.util.Scanner;

public final class Cli {

    private static String userName;

    public static void greetingUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setUserName(scanner.nextLine());
        System.out.println("Hello, " + getUserName() + "!");
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(final String name) {
        Cli.userName = name;
    }
}
