package _1_TicTacToe;

// Main class with game loop
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeLLD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Setup players
        List<Player> players = new ArrayList<>();
        players.add(new Player(PlayerSymbol.X, "Player 1"));
        players.add(new Player(PlayerSymbol.O, "Player 2"));

        // Create game with strategy
        TicTacToeGame game = new TicTacToeGame(3, players, new StandardWinStrategy());

        System.out.println("Welcome to Tic Tac Toe!");

        // Game loop
        while (game.getStatus() == GameStatus.IN_PROGRESS) {
            game.displayBoard();

            Player currentPlayer = game.getCurrentPlayer();
            System.out.printf("Player %s (%c) enter row and column (0-2): ",
                    currentPlayer.getName(), currentPlayer.getSymbol().getSymbol());

            try {
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                game.playMove(row, col);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Clear invalid input
            }
        }

        // Game over
        game.displayBoard();

        if (game.getStatus() == GameStatus.WON) {
            System.out.printf("Player %s has WON! 🎉\n", game.getWinner().getName());
        } else {
            System.out.println("It's a TIE! 🤝");
        }

        scanner.close();
    }
}
