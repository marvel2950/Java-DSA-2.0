import java.util.Scanner;

public class RatChasesItsCheese {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        char[][] maze = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = line.charAt(j);
            }
        }
    }

    public static void printPath(char[][] maze, int row, int col) {
        if(row<0 || col<0 || row >= maze.length || col > maze[0].length || maze[row][col] == 'X') {
            return;
        }
        if(row== maze.length && col== maze[0].length && maze[row][col] == '0') {
            System.out.println("path");
            return;
        }
        printPath(maze, row - 1, col); // up
        printPath(maze, row+1, col); // down
        printPath(maze, row, col - 1); // left
        printPath(maze, row, col + 1); // right
    }
}
