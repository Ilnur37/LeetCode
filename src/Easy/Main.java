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

        System.out.println(T234.isPalindrome(l5));

    }
}
