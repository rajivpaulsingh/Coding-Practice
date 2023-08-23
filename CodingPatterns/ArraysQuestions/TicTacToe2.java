package ArraysQuestions;

public class TicTacToe2 {
    private char[][] board;
    private static final int SIZE = 3;
    private static final char EMPTY = ' ';

    public TicTacToe2() {
        board = new char[SIZE][SIZE];
        // Initialize the board with empty spaces
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                board[row][col] = EMPTY;
            }
        }
    }

    public boolean isWinner(char player) {
        // Check rows
        for (int row = 0; row < SIZE; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < SIZE; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[2][0] == player && board[1][1] == player && board[0][2] == player) {
            return true;
        }

        return false;
    }

    public void printBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col]);
                if (col < SIZE - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row < SIZE - 1) {
                System.out.println("---------");
            }
        }
    }

    public static void main(String[] args) {
        
        TicTacToe2 game = new TicTacToe2();

        // Simulating a game with X as the winner
        game.board[0][0] = 'X';
        game.board[0][1] = 'X';
        game.board[0][2] = 'X';

        game.printBoard();

        if (game.isWinner('X')) {
            System.out.println("X is the winner!");
        } else {
            System.out.println("No winner yet.");
        }
    }
}

