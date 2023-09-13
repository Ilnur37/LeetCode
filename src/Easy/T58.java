package Easy;

public class T58 {
    public int lengthOfLastWord(String s) {
        int res = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) ==' ') {
                if (res == 0) continue;
                else return res;
            } else {
                res++;
            }
        }
        return res;
    }
}
