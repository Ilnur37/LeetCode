import java.util.ArrayList;
import java.util.List;

public class Easy {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while(true) {
            mid = (left + right)/2;
            if (target > nums[mid]){
                left = mid + 1;
            }
            else if (target < nums[mid]){
                right = mid - 1;
            }
            else return mid;

            if (left > right) return left;
        }
    }


    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] newnums = new int[len];
        int left = 0;
        int right = len - 1;
        int mid = 0;

        if (nums[0] >= 0 ){
            for (int i = 0; i < len; i++) {
                newnums[i] = nums[i] * nums[i];
            }
            return newnums;
        }
        if (nums[len - 1] <= 0 ){
            for (int i = len; i > -1; i--) {
                newnums[len - i] = nums[i] * nums[i];
            }
            nums = newnums.clone();
            return newnums;
        }

        while(true) {
            mid = (left + right) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else if (nums[mid] > -1) {
                if (nums[mid - 1] <= 0) {
                    break;
                }
                right = mid - 1;
            }
        }

        left = mid - 1;
        right = mid;
        int i = 0;
        while (right < len && left > -1) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                newnums[i] = nums[left] * nums[left];
                left--;
            } else {
                newnums[i] = nums[right] * nums[right];
                right++;
            }
            i++;
        }

        if (left == -1) {
            while (i != len) {
                newnums[i] = nums[right] * nums[right];
                right++;
                i++;
            }
        }else {
            while (i != len) {
                newnums[i] = nums[left] * nums[left];
                left--;
                i++;
            }
        }
        nums = newnums.clone();
        return newnums;
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0)
            return new ArrayList<Integer>();

        return spiralOrder(matrix,0,0,matrix.length,matrix[0].length);
    }


    public static ArrayList<Integer> spiralOrder(int [][] matrix, int x, int y, int m, int n){
        ArrayList<Integer> result = new ArrayList<Integer>();

        if(m<=0||n<=0)
            return result;

        //only one element left
        if(m==1&&n==1) {
            result.add(matrix[x][y]);
            return result;
        }

        //top - move right
        for(int i=0;i<n-1;i++){
            result.add(matrix[x][y++]);
        }

        //right - move down
        for(int i=0;i<m-1;i++){
            result.add(matrix[x++][y]);
        }

        //bottom - move left
        if(m>1){
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y--]);
            }
        }

        //left - move up
        if(n>1){
            for(int i=0;i<m-1;i++){
                result.add(matrix[x--][y]);
            }
        }

        if(m==1||n==1)
            result.addAll(spiralOrder(matrix, x, y, 1, 1));
        else
            result.addAll(spiralOrder(matrix, x+1, y+1, m-2, n-2));

        return result;
    }


    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                return new int[]{left + 1, right + 1};
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        return new int[0];
    }


    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        StringBuilder firstNumber = new StringBuilder(num1);
        StringBuilder secondNumber = new StringBuilder(num2);

        // Reverse both the numbers.
        firstNumber.reverse();
        secondNumber.reverse();

        // To store the multiplication result of each digit of secondNumber with firstNumber.
        int N = firstNumber.length() + secondNumber.length();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; ++i) {
            answer.append(0);
        }

        for (int place2 = 0; place2 < secondNumber.length(); place2++) {
            int digit2 = secondNumber.charAt(place2) - '0';

            // For each digit in secondNumber multiply the digit by all digits in firstNumber.
            for (int place1 = 0; place1 < firstNumber.length(); place1++) {
                int digit1 = firstNumber.charAt(place1) - '0';

                // The number of zeros from multiplying to digits depends on the
                // place of digit2 in secondNumber and the place of the digit1 in firstNumber.
                int currentPos = place1 + place2;

                // The digit currently at position currentPos in the answer string
                // is carried over and summed with the current result.
                int carry = answer.charAt(currentPos) - '0';
                int multiplication = digit1 * digit2 + carry;

                // Set the ones place of the multiplication result.
                answer.setCharAt(currentPos, (char)(multiplication % 10 + '0'));

                // Carry the tens place of the multiplication result by
                // adding it to the next position in the answer array.
                int value = (answer.charAt(currentPos + 1) - '0') + multiplication / 10;
                answer.setCharAt(currentPos + 1, (char)(value + '0'));
            }
        }

        // Pop excess 0 from the rear of answer.
        if (answer.charAt(answer.length() - 1) == '0') {
            answer.deleteCharAt(answer.length() - 1);
        }

        answer.reverse();
        return answer.toString();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-5,-3,-2,-1, 0, 8};
        int[][] arr2 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] arr3 = new int[]{2,7,11,15};
        //twoSum(arr3, 9);
        //int[][] arr2 = new int[][]{{7},{9},{6}};
        //sortedSquares(arr);
        //spiralOrder(arr2);
        multiply("-34", "10");
    }

}
