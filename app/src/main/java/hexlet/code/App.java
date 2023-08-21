package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

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
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int switcher = scanner.nextInt();
        System.out.println();

        switch (switcher) {
            case 1 -> Cli.greetingUser();
            case 2 -> {
                Cli.greetingUser();
                Even.gameEven();
            }
            case 3 -> {
                Cli.greetingUser();
                Calc.gameCalc();
            }
            case 4 -> {
                Cli.greetingUser();
                GCD.gameGCD();
            }
            case 5 -> {
                Cli.greetingUser();
                Progression.gameProgression();
            }
            default -> {
            }
        }
    }
}
