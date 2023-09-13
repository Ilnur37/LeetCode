package Easy;

public class T26 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int k = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
