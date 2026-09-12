package _1_TicTacToe;

import java.util.List;

// Enums for game state and player symbols
enum GameStatus {
    IN_PROGRESS, WON, DRAW
}

enum PlayerSymbol {
    X('X'), O('O');

    private final char symbol;

    PlayerSymbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public PlayerSymbol getOpponent() {
        return this == X ? O : X;
    }
}

// Cell class representing each position on the board
class Cell {

    private final int row;
    private final int col;
    private PlayerSymbol symbol;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.symbol = null;
    }

    public boolean isEmpty() {
        return symbol == null;
    }

    public void setSymbol(PlayerSymbol symbol) {
        this.symbol = symbol;
    }

    public PlayerSymbol getSymbol() {
        return symbol;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}

// Player class
class Player {

    private final PlayerSymbol symbol;
    private final String name;

    public Player(PlayerSymbol symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public PlayerSymbol getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}

// Board class encapsulating board operations
class Board {

    private final int size;
    private final Cell[][] cells;

    public Board(int size) {
        this.size = size;
        this.cells = new Cell[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    public boolean makeMove(int row, int col, PlayerSymbol symbol) {
        if (!isValidMove(row, col)) {
            return false;
        }

        cells[row][col].setSymbol(symbol);
        return true;
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size
                && cells[row][col].isEmpty();
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (cells[i][j].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void display() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char displayChar = cells[i][j].isEmpty() ? ' '
                        : cells[i][j].getSymbol().getSymbol();
                System.out.print(displayChar);
                if (j < size - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < size - 1) {
                System.out.println("--+---+--");
            }
        }
        System.out.println();
    }
}

// Win Strategy interface for different winning conditions
interface WinStrategy {

    boolean checkWin(Board board, PlayerSymbol symbol);
}

// Standard 3x3 Tic Tac Toe win strategy
class StandardWinStrategy implements WinStrategy {

    @Override
    public boolean checkWin(Board board, PlayerSymbol symbol) {
        int size = board.getSize();

        // Check rows and columns
        for (int i = 0; i < size; i++) {
            boolean rowWin = true;
            boolean colWin = true;

            for (int j = 0; j < size; j++) {
                // Check row
                if (board.getCell(i, j).isEmpty()
                        || board.getCell(i, j).getSymbol() != symbol) {
                    rowWin = false;
                }

                // Check column
                if (board.getCell(j, i).isEmpty()
                        || board.getCell(j, i).getSymbol() != symbol) {
                    colWin = false;
                }
            }

            if (rowWin || colWin) {
                return true;
            }
        }

        // Check diagonals
        boolean diag1Win = true;
        boolean diag2Win = true;

        for (int i = 0; i < size; i++) {
            if (board.getCell(i, i).isEmpty()
                    || board.getCell(i, i).getSymbol() != symbol) {
                diag1Win = false;
            }

            if (board.getCell(i, size - 1 - i).isEmpty()
                    || board.getCell(i, size - 1 - i).getSymbol() != symbol) {
                diag2Win = false;
            }
        }

        return diag1Win || diag2Win;
    }
}

// Game class orchestrating the game flow
class TicTacToeGame {

    private final Board board;
    private final List<Player> players;
    private Player currentPlayer;
    private GameStatus status;
    private final WinStrategy winStrategy;

    public TicTacToeGame(int boardSize, List<Player> players, WinStrategy winStrategy) {
        this.board = new Board(boardSize);
        this.players = players;
        this.currentPlayer = players.get(0);
        this.status = GameStatus.IN_PROGRESS;
        this.winStrategy = winStrategy;
    }

    public void playMove(int row, int col) {
        if (status != GameStatus.IN_PROGRESS) {
            throw new IllegalStateException("Game is already over!");
        }

        if (!board.makeMove(row, col, currentPlayer.getSymbol())) {
            throw new IllegalArgumentException("Invalid move!");
        }

        // Check for win
        if (winStrategy.checkWin(board, currentPlayer.getSymbol())) {
            status = GameStatus.WON;
        } // Check for draw
        else if (board.isFull()) {
            status = GameStatus.DRAW;
        } // Switch player
        else {
            switchPlayer();
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == players.get(0))
                ? players.get(1) : players.get(0);
    }

    public GameStatus getStatus() {
        return status;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player getWinner() {
        return status == GameStatus.WON ? currentPlayer : null;
    }

    public void displayBoard() {
        board.display();
    }
}
