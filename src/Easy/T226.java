package Easy;

public class T226 {
    public TreeNode invertTree(TreeNode root) {
        if (root.right != null && root.left != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        if (root.left != null) invertTree(root.left);
        if (root.right != null) invertTree(root.right);
        return root;
    }
}
