package hexlet.code;

import java.util.Scanner;

public final class App {

    private App() {
    }

    /**
     * App.
     *
     * @param args input
     */
    public static void main(final String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int switcher = scanner.nextInt();
        System.out.println();

        switch (switcher) {
            case 0 -> {
                return;
            }
            case 1 -> Cli.greetingUser();
            case 2 -> {
                Cli.greetingUser();
                Even.gameEven();
            }
            default -> {
            }
        }
        scanner.close();
    }

}
