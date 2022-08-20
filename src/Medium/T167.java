package Medium;

public class T167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int right = numbers.length - 1;
        int left = 0;

        for (; left < numbers.length; left++) {
            while (left < right && numbers[left] + numbers[right] >= target) {
                if (numbers[left] + numbers[right] == target) {
                    res[0] = left + 1;
                    res[1] = right + 1;
                    return res;
                } else {
                    right--;
                }
            }
            right = numbers.length - 1;
        }
        return res;
    }
}
