package Medium;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{-5,-3,-2,-1, 0, 8};
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
        int[][] arr5 = new int[][]{{2,0,1,1,1,1,1,1,1,1},{1,0,1,0,0,0,0,0,0,1},{1,0,1,0,1,1,1,1,0,1},{1,0,1,0,1,0,0,1,0,1},{1,0,1,0,1,0,0,1,0,1},
        {1,0,1,0,1,1,0,1,0,1},{1,0,1,0,0,0,0,1,0,1},{1,0,1,1,1,1,1,1,0,1},{1,0,0,0,0,0,0,0,0,1},{1,1,1,1,1,1,1,1,1,1}};
        System.out.println(T994.orangesRotting(arr4));
    }
}
