package Medium;

public class T200 {
    public static int numIslands(char[][] grid) {
        int n = 0;
        int coll = grid[0].length;
        int rows = grid.length;
        Boolean[][] pas = new Boolean[rows][coll];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coll; j++) {
                pas[i][j] = false;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coll; j++) {
                if (pas[i][j] != true && grid[i][j] == '1') {
                    pas[i][j] = true;
                    bypass(grid, i, j, pas);
                    n++;
                }
            }
        }

        return n;
    }

    public static void bypass(char[][] grid, int i, int j, Boolean[][] pas) {
        if (j + 1 < grid[0].length) {
            if (pas[i][j + 1] != true && grid[i][j + 1] == '1') {
                pas[i][j + 1] = true;
                bypass(grid, i, j + 1, pas);
            }
            pas[i][j + 1] = true;
        }
        if (j - 1 > -1) {
            if (pas[i][j - 1] != true && grid[i][j - 1] == '1') {
                pas[i][j - 1] = true;
                bypass(grid, i, j - 1, pas);
            }
            pas[i][j - 1] = true;
        }
        if (i + 1 < grid.length) {
            if (pas[i + 1][j] != true && grid[i + 1][j] == '1') {
                pas[i + 1][j] = true;
                bypass(grid, i + 1, j, pas);
            }
            pas[i + 1][j] = true;
        }if (i - 1 > -1) {
            if (pas[i - 1][j] != true && grid[i - 1][j] == '1') {
                pas[i - 1][j] = true;
                bypass(grid, i - 1, j, pas);
            }
            pas[i - 1][j] = true;
        }
    }
}
