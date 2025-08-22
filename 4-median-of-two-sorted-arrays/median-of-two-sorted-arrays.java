class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int left = 0, right = m;

        while (left <= right) {
            int midx = left + (right - left) / 2; // mid
            int midy = (m + n + 1) / 2 - midx;

            //Left half side
            int x1 = (midx == 0) ? Integer.MIN_VALUE : nums1[midx - 1];
            int x3 = (midx == m) ? Integer.MAX_VALUE : nums1[midx];

            //Right half side
            int x2 = (midy == 0) ? Integer.MIN_VALUE : nums2[midy - 1];
            int x4 = (midy == n) ? Integer.MAX_VALUE : nums2[midy];

            if (x1 <= x4 && x2 <= x3) {

                if ((m + n) % 2 == 0) {
                    return (Math.max(x1, x2) + Math.min(x3, x4)) / 2.0;
                }
                return Math.max(x1, x2);

            } else if (x1 > x4) {

                right = midx - 1;

            } else {

                left = midx + 1;

            }

        }
        return -1;
    }
}