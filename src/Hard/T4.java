package Hard;

import java.util.ArrayList;
import java.util.List;

public class T4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int start = 0;
        if ((nums1.length + nums2.length) % 2 == 0)
            start = (nums1.length + nums2.length)/2 - 1;
        else
            start = (nums1.length + nums2.length)/2;
        int idx1 = 0, idx2 = 0;

        while (idx1 != nums1.length && idx2 != nums2.length && idx1 + idx2 < start) {
            if (nums2[idx2] < nums1[idx1])
                idx2++;
            else
                idx1++;
        }

        if (idx1 + idx2 != start) {
            if (idx1 != nums1.length) {
                while (idx1 + idx2 < start)
                    idx1++;
                if ((nums1.length + nums2.length) % 2 != 0)
                    return nums1[idx1];
                else return ((double) (nums1[idx1] + nums1[idx1 + 1]) / 2);
            }
            else {
                while (idx1 + idx2 < start)
                    idx2++;
                if ((nums1.length + nums2.length) % 2 != 0)
                    return nums2[idx2];
                else return ((double) (nums2[idx2] + nums2[idx2 + 1]) / 2);
            }
        }
        else {
            if ((nums1.length + nums2.length) % 2 != 0){
                if (idx1 == nums1.length)
                    return nums2[idx2];
                else if (idx2 == nums2.length)
                    return nums1[idx1];
                else
                    return Math.min(nums1[idx1], nums2[idx2]);
            }
            else {
                int[] arr = new int[2];
                for (int i = 0; i < 2; ++i) {
                    if (idx1 != nums1.length && idx2 != nums2.length){

                        if (nums2[idx2] < nums1[idx1]) {
                            arr[i] = nums2[idx2];
                            idx2++;
                        }
                        else {
                            arr[i] = nums1[idx1];
                            idx1++;
                        }
                    }
                    else {
                        if (idx1 == nums1.length) {
                            arr[i] = nums2[idx2];
                            idx2++;
                        }
                        else {
                            arr[i] = nums1[idx1];
                            idx1++;
                        }
                    }
                }
                return ((double) (arr[0] + arr[1])/2);
            }
        }
    }
}
