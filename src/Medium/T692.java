package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class T692 {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String, Integer> map = new TreeMap<>();
        List<String> result = new ArrayList<String>();

        for (String s : words) {
            if (map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }
        while (k != 0) {
            int max = 0;
            String word = null;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    word = entry.getKey();
                    max = entry.getValue();
                }
            }
            map.remove(word);
            result.add(word);
            k--;
        }
        return result;
    }
}
