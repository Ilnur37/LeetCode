package Medium;

import java.util.Stack;

public class T394 {
    public String decodeString(String s) {
        Stack<StringBuilder> str = new Stack<>();
        Stack<Integer> nums = new Stack<>();
        StringBuilder res = new StringBuilder();
        int num = 0;
        for (char c : s.toCharArray()) {//Recursive String
            if (c == '[') {
                str.push(res);//Push
                nums.push(num);
                num = 0;//Refresh num, res
                res = new StringBuilder();
            } else if (c == ']') {
                StringBuilder tmp = new StringBuilder();
                for (int i = nums.pop(); i > 0; i--) tmp.append(res);//res*3
                res = str.pop().append(tmp);
            } else if (c >= '0' && c <= '9') num = num * 10 + (c - '0');//Calculate the number of repetitions
            else res.append(c);
        }
        return res.toString();
    }
}
