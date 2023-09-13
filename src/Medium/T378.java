package Medium;

import java.util.Arrays;

public class T378 {
    public int kthSmallest(int[][] matrix, int k) {
        int lenArr = matrix.length * matrix[0].length;
        int[] arr = new int[lenArr];
        int i = 0;
        for (int[] a : matrix) {
            for (int x : a) {
                arr[i++] = x;
            }
        }
        Arrays.sort(arr);
        return arr[k];
    }
}
