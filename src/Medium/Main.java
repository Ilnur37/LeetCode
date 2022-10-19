package Medium;

import Hard.T1335;
import Hard.T42;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{6,5,4,3,2,1};
        int[][] arr2 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] arr3 = new int[]{2,7,11,15};
        //T54.spiralOrder(arr2);
        //T43.multiply("-34", "10");
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(3, l2);
        ListNode l4 = new ListNode(5, l3);
        ListNode l5 = new ListNode(-1, l4);
        //T148.sortList(l5);
        int[][] arr4 = new int[][]{{2,1,1},{0,1,1},{1,0,1}};
        int[][] arr5 = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        //System.out.println(T994.orangesRotting(arr4));
        //System.out.println(T567.checkInclusion("ab","eidbaooo"));
        //T784.letterCasePermutation("a1b2");
        //T77.combine(4,2);
        //T48.rotate(arr5);
        //T42.trap(arr);
        T1335.minDifficulty(arr,2);
    }
}
