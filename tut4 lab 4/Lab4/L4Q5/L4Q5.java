package L4Q5;

import java.util.Random;
import java.util.Scanner;

public class L4Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int[] scores = {0, 0};
        int currentPlayer = 0;

        while (scores[0] <= 100 && scores[1] <= 100) {
            System.out.println("\nPlayer " + (currentPlayer + 1) + "'s turn.");
            boolean rollAgain;

            do {
                System.out.print("Press Enter to roll the dice...");
                input.nextLine();

                int dice = random.nextInt(6) + 1;
                System.out.println("You rolled: " + dice);
                scores[currentPlayer] += dice;
                System.out.println("Player " + (currentPlayer + 1) + " score: " + scores[currentPlayer]);

                rollAgain = dice == 6 && scores[currentPlayer] <= 100;
            } while (rollAgain);

            if (scores[currentPlayer] > 100) {
                break;
            }

            currentPlayer = 1 - currentPlayer;
        }

        System.out.println("\nPlayer " + (currentPlayer + 1) + " wins!");
        System.out.println("Player 1: " + scores[0]);
        System.out.println("Player 2: " + scores[1]);
        input.close();
    }
}
