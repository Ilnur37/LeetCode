package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T438 {public List<Integer> findAnagrams(String s, String p) {
    ArrayList<Integer> ans=new ArrayList<>();
    // Frequency arrays

    int arr1[]=new int[26];
    int arr2[]=new int[26];
    int n = s.length(), m = p.length();
    if (m > n)
        return ans;
    // First window
    for (int i = 0; i < m; i++)
    {
        arr1[p.charAt(i) - 'a']++;
        arr2[s.charAt(i) - 'a']++;
    }
    if (Arrays.equals(arr1,arr2))
        ans.add(0);
    // subsequent windows
    for (int i = m; i < n; i++)
    {
        arr2[s.charAt(i) - 'a']++;
        arr2[s.charAt(i - m) - 'a']--;
        if (Arrays.equals(arr1,arr2))
            ans.add(i - m + 1);
    }
    return ans;
}
}