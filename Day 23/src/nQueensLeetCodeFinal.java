class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> list = new ArrayList<>();
        nQueensSol(board, n, 0, list);
        return list;
    }

    private static void nQueensSol(boolean[][] board, int tq, int row, List<List<String>> list) {
        if (tq == 0) {
            addToList(board, list);
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                nQueensSol(board, tq - 1, row + 1, list);
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

    public static void addToList(boolean[][] board, List<List<String>> list) {
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String ansRow = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == true) {
                    ansRow = ansRow + "Q";
                } else {
                    ansRow = ansRow + ".";
                }
            }
            tempList.add(ansRow);
        }
        list.add(tempList);
    }
}