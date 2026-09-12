package _1_TicTacToe;

import java.util.Scanner;

/**
 * Tic Tac Toe 3x3 Game
 */
public class TicTacToe_1 {

    public static void main(String[] args) {

        char[][] board = new char[3][3];
        initializeBoard(board);

        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);

            System.out.print("Player " + player + " enter row and column (0-2): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            // Validate input
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid position! Please enter values between 0 and 2.");
                continue;
            }

            // Place the move
            if (board[row][col] == ' ') {
                board[row][col] = player;

                if (haveWon(board, player)) {
                    printBoard(board);
                    System.out.println("Player " + player + " has WON! 🎉");
                    gameOver = true;
                } else if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("It's a TIE! 🤝");
                    gameOver = true;
                } else {
                    // Switch player
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move! Cell already taken. Try again.");
            }
        }

        sc.close();
    }

    // Initialize the board with empty spaces
    public static void initializeBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = ' ';
            }
        }
    }

    // Print the game board
    public static void printBoard(char[][] board) {
        System.out.println();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col]);
                if (col < board[0].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row < board.length - 1) {
                System.out.println("--+---+--");
            }
        }
        System.out.println();
    }

    // Check if the current player has won
    public static boolean haveWon(char[][] board, char player) {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    // Check if the board is full
    public static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
