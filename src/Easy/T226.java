package Easy;

public class T226 {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        if (root.right != null || root.left != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
