package Medium;

public class T198 {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        int max = Math.max(nums[0], nums[1]);
        nums[2] += nums[0];

        for (int i = 3; i < nums.length; ++i) {
            nums[i] += max;
            max = Math.max(max, nums[i - 1]);
        }
        return Math.max(max, nums[nums.length - 1]);
    }
}
