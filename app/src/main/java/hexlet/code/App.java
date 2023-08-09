package hexlet.code;

import java.util.Scanner;

public class App {

    /**
     * Project java-project-lvl1.
     *
     * @param args input parameters
     */
    public static void main(final String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("1")) {
            Cli.greetingUser();
        }
    }

}
