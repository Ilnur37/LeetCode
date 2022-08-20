package Medium;

import java.util.HashMap;

public class T424 {
    public int characterReplacement(String s, int k) {
        int start = 0, end = 0, maxFrequency = Integer.MIN_VALUE;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int maxLength = 0;
        //iterate the string and extend window range from the right side
        for (end = 0; end < s.length(); end++){
            char rightChar = s.charAt(end);
            hashMap.put(rightChar, hashMap.getOrDefault(rightChar, 0) + 1);
            maxFrequency = Math.max(hashMap.get(rightChar), maxFrequency);

            //shrink the window from the left
            if(end - start + 1 - maxFrequency > k){
                char leftChar = s.charAt(start);
                hashMap.put(leftChar, hashMap.get(leftChar) - 1);
                start++;
            }

        }
        maxLength = end - start;
        return end - start;
    }
}
