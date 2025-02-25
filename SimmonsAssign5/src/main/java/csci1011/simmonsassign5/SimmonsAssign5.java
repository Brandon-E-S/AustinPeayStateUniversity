package csci1011.simmonsassign5;

import java.util.Scanner;

/**
 * CSCI 1010 Assign 5
 * @author Brandon Simmons
 * Description: Tennis Match Simulator!
 */
public class SimmonsAssign5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            System.out.println("Welcome to Brandon Simmons' tennis match simulator");

            // Gets user input.
            System.out.print("Please enter the number of sets needed to win a match: ");
            int setsToWin = scanner.nextInt();

            System.out.print("Please enter the probability of player 1 winning (between 0.0 and 1.0): ");
            double player1Prob = scanner.nextDouble();

            System.out.print("Please enter the probability of player 2 winning (between 0.0 and 1.0): ");
            double player2Prob = scanner.nextDouble();

            //* Creates a TennisMatch object and starts the match.
            TennisMatch match = new TennisMatch(setsToWin, player1Prob, player2Prob);
            match.playMatch();

            // Asks if they want to run another simulation.
            System.out.print("Would you like to run another simulation? (Y/N): ");
            char response = scanner.next().charAt(0);
            playAgain = (response == 'Y' || response == 'y');

        } while (playAgain);

        System.out.println("Thank you for using the tennis match simulator!");
    }
}
