class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
            if (mp.get(num) == 2) {
                result.add(num);
            }

        }
        //Convert List<Integer> to int[]
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}