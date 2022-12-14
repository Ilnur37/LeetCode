package Medium;

import java.util.ArrayList;
import java.util.List;

public class T77 {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        combination(result, new ArrayList<Integer>(), 1, n, k);
        return result;
    }
    public static void combination(List<List<Integer>> result, List<Integer> list, int start, int n, int k){
        if(k == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i <= n - k + 1; i++){
            list.add(i);
            combination(result, list, i + 1, n, k - 1);
            list.remove(list.size() - 1);
        }
    }
}
