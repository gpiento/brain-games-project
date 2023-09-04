package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final String MESSAGE_WRONG = "'%s' is wrong answer ;(. Correct answer was '%s'.";
    public static final int COUNT_QUEST = 3;

    public static void run(String gameMessages, String[][] gameQuestions) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String nameUser = scanner.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        System.out.println(gameMessages);

        for (int i = 0; i < COUNT_QUEST; i++) {
//            System.out.println("QQQ:" + gameQuestions[i][0] + " AAA:" + gameQuestions[i][1]);
            System.out.println("Question: " + gameQuestions[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(gameQuestions[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf(MESSAGE_WRONG + "\n", answer, gameQuestions[i][1]);
                System.out.println("Let's try again, "
                                   + nameUser + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + nameUser + "!");
    }

}
