class Solution {
    public int minimumOperations(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int rem = num % 3;
            sum += Math.min(rem, 3 - rem);
        }
        return sum;
    }
}