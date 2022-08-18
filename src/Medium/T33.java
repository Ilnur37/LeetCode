package Medium;

public class T33 {
    public int search(int[] nums, int target) {
        int firstEl = nums[0];
        int st = 0;
        int end = nums.length - 1;
        int mid;
        if (target == firstEl) return 0;
        else if (target > firstEl) {
            while (true) {
                mid = (end + st)/2;
                if (target == nums[mid]) return mid;
                if(end <= st)return -1;
                else if (target > nums[mid] && nums[mid] >= firstEl) {
                    st = mid + 1;
                }
                else if ((target < nums[mid] && nums[mid] >= firstEl) || (nums[mid] <= firstEl)) {
                    end = mid - 1;
                }

            }
        }
        else if (target < firstEl) {
            while (true) {
                mid = (end + st)/2;
                if (target == nums[mid]) return mid;
                if(end <= st)return -1;
                else if ((target > nums[mid] && nums[mid] <= firstEl) || (nums[mid] >= firstEl)) {
                    st = mid + 1;
                }
                else if (target < nums[mid] && nums[mid] <= firstEl) {
                    end = mid - 1;
                }

            }
        }

        return -1;
    }
}
