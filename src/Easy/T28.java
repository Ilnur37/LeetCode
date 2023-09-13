package Easy;

public class T28 {
    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;
        int len1 = haystack.length();
        int len2 = needle.length();
        int res = -1;
        for (int i = 0; i < len1 - len2 + 2; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                res = i;
                boolean f = true;
                for (int j = 1; j < len2; j++) {
                    i++;
                    if (haystack.charAt(i) != needle.charAt(j)) {
                        f = false;
                        break;
                    }
                }
                if (f) return res;
                i = res;
            }
        }
        return -1;
    }
}
