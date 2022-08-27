package Medium;

import java.util.ArrayList;
import java.util.List;

public class T784 {
    public static List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder str = new StringBuilder(s);
        res.add(s);
        changeStr(str,0, res);

        return res;
    }
    public static void changeStr(StringBuilder s, int pos, List<String> res) {
        while (pos < s.length() && (s.charAt(pos) < 65 || s.charAt(pos) > 90) && (s.charAt(pos) < 97 || s.charAt(pos) > 122)) {
            pos++;
        }

        if (pos >= s.length()) return;
        changeStr(s, pos + 1, res);

        if (s.charAt(pos) > 64 && s.charAt(pos) < 91) {
            s.replace(pos, pos+1, s.substring(pos, pos+1).toLowerCase());
        } else {
            s.replace(pos, pos+1, s.substring(pos, pos+1).toUpperCase());
        }
        res.add(s.toString());
        changeStr(s, pos + 1, res);
    }
}
