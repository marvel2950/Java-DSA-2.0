import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        char[][] maze = new char[n][m];
        int[][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = line.charAt(j);
            }
        }
        printPath(maze, 0, 0, ans);

        if (!valueFound) {
            System.out.println("NO PATH FOUND");
        }
    }

    static Boolean valueFound = false;

    public static void printPath(char[][] maze, int row, int col, int[][] ans) {
        if (row == maze.length - 1 && col == maze[0].length - 1 && maze[row][col] != 'X') {
            ans[row][col] = 1;
            valueFound = true;
            display2DArray(ans);
            return;
        }

        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || maze[row][col] == 'X') {
            return;
        }

        maze[row][col] = 'X';
        ans[row][col] = 1;

        printPath(maze, row - 1, col, ans); // up
        printPath(maze, row + 1, col, ans); // down
        printPath(maze, row, col - 1, ans); // left
        printPath(maze, row, col + 1, ans); // right

        maze[row][col] = 'O';
        ans[row][col] = 0;
    }

    private static void display2DArray(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
