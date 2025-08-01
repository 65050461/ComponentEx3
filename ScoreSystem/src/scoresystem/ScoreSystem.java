package scoresystem;

import java.util.Scanner;

public class ScoreSystem {
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();

        ScoreSubscriber sub1 = new ScoreSubscriber();
        ScoreSubscriber sub2 = new ScoreSubscriber();
        
        scoreSource.addScoreListener(sub1);
        scoreSource.addScoreListener(sub2);

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter Score ");
            input = scanner.nextLine().trim();
            if (input.isEmpty()) break;

            scoreSource.setScoreLine(input);
        }

        System.out.println("Program terminated.");
    }
}