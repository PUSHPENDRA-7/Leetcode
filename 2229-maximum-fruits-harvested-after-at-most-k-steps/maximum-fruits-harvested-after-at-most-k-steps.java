//Approach (Binary Search and prefix sum)
//T.C : O(n+klogn)
//S.C : O(n)

class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {

        int n = fruits.length;

        int[] perfixSum = new int[n];//fruits prefixSum
        int[] indices= new int[n];//sorted already

        for (int i = 0; i < n; i++) {
            indices[i] = fruits[i][0];

            perfixSum[i] = fruits[i][1] + (i > 0 ? perfixSum[i - 1] : 0);
        }

        int maxFruits = 0;

        for (int d = 0; d <= k / 2; d++) {
            //case1 - moved d step to left 
            int remain = k - 2 * d;
            int i = startPos - d;
            int j = startPos + remain;

            int left = lowerBound(indices, i);
            int right = upperBound(indices, j) - 1;

            if (left <= right) {
                int total = perfixSum[right] - (left > 0 ? perfixSum[left - 1] : 0);
                maxFruits = Math.max(maxFruits, total);
            }

            //case2 - moved d step to the right hand side
            remain = k - 2 * d;
            i = startPos - remain;
            j = startPos + d;

            left = lowerBound(indices, i);
            right = upperBound(indices, j) - 1;

            if (left <= right) {
                int total = perfixSum[right] - (left > 0 ? perfixSum[left - 1] : 0);
                maxFruits = Math.max(maxFruits, total);
            }
        }
        return maxFruits;
    }

    // Helper method to find the lower bound index (Binary Search)
    private int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    // Helper method to find the upper bound index(Binary Search)
    private int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}