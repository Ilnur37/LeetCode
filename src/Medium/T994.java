package Medium;

import java.util.LinkedList;
import java.util.Queue;

public class T994 {
    static int[][] direction = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
    public static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    count++;//Count the number of fresh oranges
                }
                if (grid[i][j] == 2) {
                    queue.add(new int[] { i, j });
                }
            }
        }
        int minute = 0;
        while (count > 0 && !queue.isEmpty()) {
            minute++;
            int n = queue.size();//The number of rotten oranges in the current layer, because each layer is updating the queue
            for (int i = 0; i < n; i++) {
                int[] decomposed = queue.poll();//The rotten oranges go out
                int row = decomposed[0];
                int col = decomposed[1];
                for (int k = 0; k < 4; k++) {
                    int x = row + direction[k][0];
                    int y = col + direction[k][1];
                    if (x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        count--;
                        queue.add(new int[] { x, y });//Rotten oranges join the team
                    }
                }
            }
        }
        //If there are healthy oranges, return -1, otherwise, return the time
        return count > 0 ? -1 : minute;
    }
}
