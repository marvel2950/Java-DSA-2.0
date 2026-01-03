public class QueenCombinations {
    public static void main(String args[]) {
        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n]; // occupied or not
        comb(board, tq, 0, "", 0);
    }

    // qpsf - > queen placed so far
    // tq - > total number of queens
    static void comb(boolean[] board, int tq, int qpsf, String ans, int idx) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true; // queen placed
                comb(board, tq, qpsf + 1, ans + " b" + i + " q" + qpsf, i + 1);
                board[i] = false; // queen removed -> backtracking
            }
        }
    }

}

