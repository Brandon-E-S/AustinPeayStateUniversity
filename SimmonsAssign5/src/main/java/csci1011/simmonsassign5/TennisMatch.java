package csci1011.simmonsassign5;

/**
 * CSCI 1010 Assign 5
 * @author Brandon Simmons
 * Description: Tennis Match class for behind the scenes work.
 */
public class TennisMatch {

    private int setsToWin;
    private double player1Prob;
    private double player2Prob;
    private boolean playerOneServing;
    private int player1SetsWon;
    private int player2SetsWon;
    private int player1GamesWon;
    private int player2GamesWon;
    private String results;

    //* Refreshes the variables above.
    public TennisMatch(int setsToWin, double player1Prob, double player2Prob) {
        this.setsToWin = setsToWin;
        this.player1Prob = player1Prob;
        this.player2Prob = player2Prob;
        this.playerOneServing = true;
        this.player1SetsWon = 0;
        this.player2SetsWon = 0;
        this.results = "";
    }

    //* Public method to start the match.
    public void playMatch() {
        while (!matchOver()) {
            playSet();
        }

        if (player1SetsWon == setsToWin) {
            System.out.println("Player 1 wins: " + results);
        } else {
            System.out.println("Player 2 wins: " + results);
        }
    }

    //* Private method to play a set
    private void playSet() {
        player1GamesWon = 0;
        player2GamesWon = 0;

        while (!setOver()) {
            playGame();
        }

        // Determine who won the set
        if (player1GamesWon > player2GamesWon) {
            player1SetsWon++;
        } else {
            player2SetsWon++;
        }

        // Add set results to results string
        results += player1GamesWon + "-" + player2GamesWon + " ";
    }

    //* Private method to play a game.
    private void playGame() {
        double randomNumber = Math.random();
        if (playerOneServing) {
            if (randomNumber <= player1Prob) {
                player1GamesWon++;
            } else {
                player2GamesWon++;
            }
        } else {
            if (randomNumber <= player2Prob) {
                player2GamesWon++;
            } else {
                player1GamesWon++;
            }
        }

        //* Switch the server.
        playerOneServing = !playerOneServing;
    }

    //* Private method to determine if match is over.
    private boolean matchOver() {
        return (player1SetsWon == setsToWin || player2SetsWon == setsToWin);
    }

    //* Private method to determine if set is over including the 2 game over rule.
    private boolean setOver() {
        return ((player1GamesWon >= 6 && player1GamesWon >= player2GamesWon + 2)
                || (player2GamesWon >= 6 && player2GamesWon >= player1GamesWon + 2));
    }
}

