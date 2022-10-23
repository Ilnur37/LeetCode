package Medium;

public class T64 {
    public static int minPathSum(int[][] grid) {
        for (int j = 1; j < grid[0].length; j++) {
            grid[0][j] += grid[0][j - 1];
        }

        for (int i = 1; i < grid.length; ++i) {
            int j = 0;
            grid[i][0] += grid[i - 1][0];
            for (j = 1; j < grid[0].length; ++j) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
