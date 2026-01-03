public class QueenPermutations {
    public static void main(String args[]) {
        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n]; // occupied or not
        perm(board, tq, 0, "");
    }

    // qpsf - > queen placed so far
    // tq - > total number of queens
    static void perm(boolean[] board, int tq, int qpsf, String ans) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true; // queen placed
                perm(board, tq, qpsf + 1, ans + " b" + i + " q" + qpsf + " |");
                board[i] = false; // queen removed -> backtracking
            }
        }
    }

}
