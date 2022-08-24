package Easy;

import Medium.ListNode;

public class Main {
    public static void main(String[] args) {
        String a = "Let's take LeetCode contest";
        //T557.reverseWords(a);
        Easy.ListNode l1 = new Easy.ListNode(1);
        Easy.ListNode l2 = new Easy.ListNode(2, l1);
        Easy.ListNode l3 = new Easy.ListNode(3, l2);
        Easy.ListNode l4 = new Easy.ListNode(2, l3);
        Easy.ListNode l5 = new Easy.ListNode(1, l4);

        //System.out.println(T234.isPalindrome(l5));
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(6);
        TreeNode t4 = new TreeNode(9);
        TreeNode t5 = new TreeNode(2, t1, t2);
        TreeNode t6 = new TreeNode(7,t3,t4);
        TreeNode t7 = new TreeNode(1,t5,t6);


        T226.invertTree(t7);
    }
}
