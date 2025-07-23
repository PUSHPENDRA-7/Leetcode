class Solution {
    public int maximumGain(String s, int x, int y) {
        int n = s.length();

        int score = 0;

        String maxstr = (x > y) ? "ab" : "ba"; //x greater than y
        String minstr;
        if (maxstr.equals("ab")) { //This is updated code new test case was added in Leetcode
            minstr = "ba";
        } else {
            minstr = "ab";
        }

        //first pass
        String tempFrist = removedString(s, maxstr);
        int removedPairCount = (n - tempFrist.length()) / 2;
        score += removedPairCount * Math.max(x, y);

        //Second
        String tempSecond = removedString(tempFrist, minstr);
        removedPairCount = (tempFrist.length() - tempSecond.length()) / 2;
        score += removedPairCount * Math.min(x, y);

        return score;

    }

    private String removedString(String s, String matchStr) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ch == matchStr.charAt(1) && stack.peek() == matchStr.charAt(0)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder remainStr = new StringBuilder();
        while (!stack.isEmpty()) {
            remainStr.append(stack.pop());
        }
        return remainStr.reverse().toString();
    }
}