package hexlet.code;

import java.util.Scanner;

public final class Cli {

    public static void greetingUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String nameUser = scanner.nextLine();
        System.out.println("Hello, " + nameUser + "!");
    }
}
