package ArraysQuestions;

public class TicTacToe {
    private static final int SIZE = 3;
    private static final char EMPTY = ' ';

    public static char calculateWinner(char[] board) {
        // Check rows
        for (int row = 0; row < SIZE; row++) {
            int startIndex = row * SIZE;
            if (board[startIndex] != EMPTY && board[startIndex] == board[startIndex + 1] && board[startIndex] == board[startIndex + 2]) {
                return board[startIndex];
            }
        }

        // Check columns
        for (int col = 0; col < SIZE; col++) {
            if (board[col] != EMPTY && board[col] == board[col + SIZE] && board[col] == board[col + 2 * SIZE]) {
                return board[col];
            }
        }

        // Check diagonals
        if (board[0] != EMPTY && board[0] == board[4] && board[0] == board[8]) {
            return board[0];
        }
        if (board[2] != EMPTY && board[2] == board[4] && board[2] == board[6]) {
            return board[2];
        }

        return ' ';
    }

    public static void main(String[] args) {
        char[] board1 = {'X', 'X', 'X', EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY};
        char[] board2 = {'O', 'O', 'O', EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY};
        char[] board3 = {'X', 'O', 'O', 'O', 'X', 'X', 'O', 'X', 'X'};

        char winner1 = calculateWinner(board1);
        char winner2 = calculateWinner(board2);
        char winner3 = calculateWinner(board3);

        System.out.println("Winner 1: " + (winner1 == ' ' ? "No winner" : winner1));
        System.out.println("Winner 2: " + (winner2 == ' ' ? "No winner" : winner2));
        System.out.println("Winner 3: " + (winner3 == ' ' ? "No winner" : winner3));
    }
}
