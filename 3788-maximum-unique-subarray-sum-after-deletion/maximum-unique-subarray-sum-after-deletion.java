class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        int MaxNeg = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num <= 0) {

                MaxNeg = Math.max(MaxNeg, num);

            } else if (!set.contains(num)) {

                sum += num;
                set.add(num);

            }
        }

        return sum == 0 ? MaxNeg : sum;
    }

    // public int maxSum(int[] nums) {
        
    //     int mp[] = new int[101];

    //     Arrays.fill(mp, -1);
        
    //     int sum = 0;

    //     int MaxNeg = Integer.MIN_VALUE;

    //     for (int num : nums) {
    //         if (num <= 0) {

    //             MaxNeg = Math.max(MaxNeg, num);

    //         } else if (mp[num] == -1) {
 
    //             sum += num;
    //             mp[num] = 1;

    //         }
    //     }

    //     return sum > 0 ? sum : MaxNeg ;
    // }
}