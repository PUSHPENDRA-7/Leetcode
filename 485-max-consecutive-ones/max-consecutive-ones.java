class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    var cnt = 0;
    var max = 0;

    for (var i = 0; i < nums.length; i++) {
        if (nums[i] == 1) {
            cnt++;
        } else {
            cnt = 0;
        }
        max = Math.max(max, cnt);
    }
    return max;
    }
}