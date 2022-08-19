package Medium;

import java.util.ArrayList;
import java.util.List;

public class T102 {
    static int deep = 0;
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> travers = new ArrayList<>();
        deep = 0;
        if (root == null) return travers;
        List<Integer> row = new ArrayList<>();

        row.add(root.val);
        travers.add(row);
        int lvl = 0;

        checkChildren(root, ++lvl, travers);

        return travers;
    }

    public static void checkChildren(TreeNode node, int lvl, List<List<Integer>> tr) {
        if (lvl > deep && (node.left != null || node.right != null)) {
            List<Integer> row = new ArrayList<>();
            tr.add(row);
            deep = lvl;
        }
        if (node.left != null) {
            tr.get(lvl).add(node.left.val);
            checkChildren(node.left, ++lvl, tr);
            lvl--;

        }
        if (node.right != null) {
            tr.get(lvl).add(node.right.val);
            checkChildren(node.right, ++lvl, tr);
            lvl--;
        }
    }
}
