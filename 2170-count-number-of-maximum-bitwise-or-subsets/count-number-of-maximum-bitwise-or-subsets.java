class Solution {
    private int countSubset(int idx, int currOr, int[] nums, int maxOr) {
        if (idx == nums.length) {
            if (currOr == maxOr) {
                return 1;
            }
            return 0;
        }
        //take count nums[idx]
        int takeCount = countSubset(idx + 1, currOr | nums[idx], nums, maxOr);

        //non take count nums[idx]
        int nontakeCount = countSubset(idx + 1, currOr, nums, maxOr);

        return takeCount + nontakeCount;
    }

    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }
        int currOr = 0;
        return countSubset(0, currOr, nums, maxOr);
    }

}