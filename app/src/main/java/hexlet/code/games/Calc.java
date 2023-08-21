package hexlet.code.games;

import hexlet.code.Cli;

import static hexlet.code.Engine.*;

public final class Calc {

    private Calc() {
    }

    /**
     * game Even.
     */
    public static void gameCalc() {
        System.out.println("Answer 'yes' if the number is even, otherwise"
                           + " answer 'no'.");
        int oper = randomOperation();
        int count = 0;
        int numRnd;

        while (count < COUNT_QUEST) {
            numRnd = randomNumber();
            System.out.println("Question: " + numRnd);
            System.out.print("Your answer: ");
            String answer = getAnswer();
            if ((isEven(numRnd) && answer.equals("yes"))
                || (!isEven(numRnd) && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                                   + "Correct answer was '"
                                   + (isEven(numRnd) ? "yes" : "no") + "'.");
                System.out.println("Let's try again, "
                                   + Cli.getUserName() + "!");
                return;
            }
            count++;
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}
