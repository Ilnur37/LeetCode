package Hard;

public class T42 {
    public static int trap(int[] height) {
        int n = height.length;

        int num_blocks = 0;

        int max_height = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max_height = Math.max(max_height, height[i]);
            num_blocks += height[i];
        }

        int wather = 0, left = 0, right = n - 1;

        for (int i = 1; i <= max_height; i++) {

            while (height[left] < i) {
                left++;
            }

            while (height[right] < i) {
                right--;
            }

            wather += (right - left + 1);
        }

        wather -= num_blocks;
        return wather;
    }
}
