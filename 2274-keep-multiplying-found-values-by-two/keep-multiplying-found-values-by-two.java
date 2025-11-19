class Solution {
    public int findFinalValue(int[] nums, int org) {
        Arrays.sort(nums);
        for (int num : nums) {
            if (org == num) {
                org *= 2;
            }
        }
        return org;
    }
}