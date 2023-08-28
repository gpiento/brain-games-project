package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class App {

    public static final int GREETING_USER = 1;
    public static final int GAME_EVEN = 2;
    public static final int GAME_CALC = 3;
    public static final int GAME_GCD = 4;
    public static final int GAME_PROGRESSION = 5;
    public static final int GAME_PRIME = 6;

    public static void main(final String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int switcher = scanner.nextInt();
        System.out.println();

        switch (switcher) {
            case GREETING_USER -> Cli.greetingUser();
            case GAME_EVEN -> {
                Cli.greetingUser();
                Even.gameEven();
            }
            case GAME_CALC -> {
                Cli.greetingUser();
                Calc.gameCalc();
            }
            case GAME_GCD -> {
                Cli.greetingUser();
                GCD.gameGCD();
            }
            case GAME_PROGRESSION -> {
                Cli.greetingUser();
                Progression.gameProgression();
            }
            case GAME_PRIME -> {
                Cli.greetingUser();
                Prime.gamePrime();
            }
            default -> throw new InputMismatchException("Не правильный выбор.");
        }
    }
}
