package Medium;

public class T171 {
    public static int titleToNumber(String columnTitle) {
        //char[] arr = columnTitle.toCharArray();
        if (columnTitle.equals(""))
            return 0;
        int a = columnTitle.length() > 1 ? (columnTitle.charAt(0) - 64) * (int)Math.pow(26, columnTitle.length() - 1) : columnTitle.charAt(0) - 64;
        return (a) + titleToNumber(columnTitle.substring(1, columnTitle.length()));
    }
}
