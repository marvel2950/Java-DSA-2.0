public class nQueens {
    public static void main(String args[]) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nQueensSol(board, n, 0);
//        display(board);
    }

    // tq -> total queens
    private static void nQueensSol(boolean[][] board, int tq, int row) {
        if(tq == 0) {
            display(board);
            System.out.println();
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                nQueensSol(board, tq - 1, row + 1);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // up
        int r = row;
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }

        // left-diagonal
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c--;
        }

        // right-diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
