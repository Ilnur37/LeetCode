package Medium;

public class T48 {
    public static void rotate(int[][] matrix) {
        int x = matrix.length;
        int currX = 0;

        while (currX < x/2) {
            int temp = 0;
            int[] str = new int[x];
            for (int i = currX; i < x-1-currX; i++) {
                str[i] = matrix[currX][i];
            }

            for (int i = currX; i < x-1-currX; i++) {
                temp = str[i];
                str[i] = matrix[i][x - 1 - currX];
                matrix[i][x - 1 - currX] = temp;
            }
            str[x-1] = matrix[x-1][x - 1 - currX];

            for (int i = currX; i < x-1-currX; i++) {
                temp = str[i];
                str[i] = matrix[x - 1 - currX][x - 1 - i];
                matrix[x - 1 - currX][x - 1 - i] = temp;
            }
            str[x-1] = matrix[x - 1 - currX][0];

            for (int i = currX; i < x-1-currX; i++) {
                temp = str[i];
                str[i] = matrix[x - 1 - i][currX];
                matrix[x - 1 - i][currX] = temp;
            }
            str[x-1] = matrix[0][currX];

            for (int i = currX; i < x-1-currX; i++) {
                temp = str[i];
                str[i] = matrix[currX][i];
                matrix[currX][i] = temp;
            }

            currX++;
        }

    }
}
