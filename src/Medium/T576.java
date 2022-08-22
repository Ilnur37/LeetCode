package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T576 {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int M = 1000000000 + 7;
        int dp[][] = new int[m][n];
        dp[startRow][startColumn] = 1;
        int count = 0;
        for (int moves = 1; moves <= maxMove; moves++) {
            int[][] temp = new int[m][n];
            int endC = (startRow + moves + 1 < m ? startRow + moves + 1 : m);
            int endR = (startColumn + moves + 1 < n ? startColumn + moves + 1 : n);

            for (int i = (startRow - moves - 1 > 0 ? startRow - moves - 1 : 0); i < endC; i++) {
                for (int j = (startColumn - moves - 1 > 0 ? startColumn - moves - 1 : 0); j < endR; j++) {
                    if (i == m - 1) count = (count + dp[i][j]) % M;
                    if (j == n - 1) count = (count + dp[i][j]) % M;
                    if (i == 0) count = (count + dp[i][j]) % M;
                    if (j == 0) count = (count + dp[i][j]) % M;
                    temp[i][j] = (
                            ((i > 0 ? dp[i - 1][j] : 0) + (i < m - 1 ? dp[i + 1][j] : 0)) % M +
                                    ((j > 0 ? dp[i][j - 1] : 0) + (j < n - 1 ? dp[i][j + 1] : 0)) % M
                    ) % M;
                }
            }
            dp = temp;
        }
        return count;
    }
}
