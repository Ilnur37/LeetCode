package Easy;

import java.util.Arrays;

public class T88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }  else {
            int index = nums1.length - 1;
            while (n > 0 && m > 0 ) {
                if (nums1[m-1] > nums2[n-1]) {
                    nums1[index] =  nums1[m-1];
                    m -=1;
                } else {
                    nums1[index] = nums2[n-1];
                    n -=1;
                }
                index -= 1;
            }
            if (m == 0) {
                for (int i = 0; i < n; i++) {
                    nums1[i] = nums2[i];
                }
            }
        }
    }
}
