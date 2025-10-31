class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // List<Integer> result = new ArrayList<>();
        // Map<Integer, Integer> mp = new HashMap<>();

        // for (int num : nums) {
        //     mp.put(num, mp.getOrDefault(num, 0) + 1);
        //     if (mp.get(num) == 2) {
        //         result.add(num);
        //     }

        // }
        // //Convert List<Integer> to int[]
        // int[] res = new int[result.size()];
        // for (int i = 0; i < result.size(); i++) {
        //     res[i] = result.get(i);
        // }

        // return res;

        int[] result = new int[2];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result[count] = nums[i];
                    count++;
                    break;
                }
            }
        }
        return result;
    }
}