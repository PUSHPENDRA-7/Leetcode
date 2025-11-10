// class Solution {
//     public int minOperations(int[] nums) {
//         // monotonic - increasing stack
//         // T.C O(n)
//         // S.C O(n)
//         Stack<Integer> st = new Stack<>();
//         int ops = 0;

//         for (int num : nums) {
//             while (!st.isEmpty() && st.peek() > num) {
//                 st.pop();
//             }

//             if (num == 0)
//                 continue;

//             if (st.isEmpty() || st.peek() < num) {
//                 ops++;
//                 st.push(num);
//             }
//         }
//         return ops;
//     }
// }

class Solution {
    public int minOperations(int[] nums) {
        var stack = new int[nums.length + 1];
        var top = 0;
        var ans = 0;
        for (var i = 0; i < nums.length; i++) {
            while (stack[top] > nums[i]) {
                top--;
                ans++;
            }
            if (stack[top] != nums[i])
                stack[++top] = nums[i];
        }
        return ans + top;
    }
}