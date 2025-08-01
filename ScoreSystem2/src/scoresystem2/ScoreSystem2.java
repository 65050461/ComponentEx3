package scoresystem2;

import java.util.Scanner;

public class ScoreSystem2 {
    public static void main(String[] args) {
        LiveScoreBean scoreBean = new LiveScoreBean();

        ScoreSubscriber subscriber1 = new ScoreSubscriber("Subscriber A");
        ScoreSubscriber subscriber2 = new ScoreSubscriber("Subscriber B");

        scoreBean.addPropertyChangeListener(subscriber1);
        scoreBean.addPropertyChangeListener(subscriber2);

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter Score ");
            input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                break;
            }

            scoreBean.setScoreLine(input);
        }

        System.out.println("Program terminated.");
        scanner.close();
    }
}