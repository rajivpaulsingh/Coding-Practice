package LeetCode100;

public class ValidSudoku {

    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        boolean isValidSudoku = isValidSudoku(board);
        System.out.println("Is the Sudoku board valid? " + isValidSudoku);
    }

    public static boolean isValidSudoku(int[][] board) {
        int n = board.length;

        // Check rows
        for (int i = 0; i < n; i++) {
            boolean[] used = new boolean[n + 1];
            for (int j = 0; j < n; j++) {
                int num = board[i][j];
                if (num != 0) {
                    if (used[num]) {
                        return false;
                    }
                    used[num] = true;
                }
            }
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            boolean[] used = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                int num = board[i][j];
                if (num != 0) {
                    if (used[num]) {
                        return false;
                    }
                    used[num] = true;
                }
            }
        }

        // Check sub-grids
        int subGridSize = (int) Math.sqrt(n);
        for (int k = 0; k < n; k += subGridSize) {
            for (int l = 0; l < n; l += subGridSize) {
                boolean[] used = new boolean[n + 1];
                for (int i = k; i < k + subGridSize; i++) {
                    for (int j = l; j < l + subGridSize; j++) {
                        int num = board[i][j];
                        if (num != 0) {
                            if (used[num]) {
                                return false;
                            }
                            used[num] = true;
                        }
                    }
                }
            }
        }

        return true;
    }
}

