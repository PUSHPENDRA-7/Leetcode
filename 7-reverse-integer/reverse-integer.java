class Solution {
    public int reverse(int n) {
        int revNum = 0;
        while (n != 0) {
            int dig = n % 10;
            if (revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE / 10) {
                return 0;
            }
            revNum = revNum * 10 + dig;
            n = n / 10;
        }
        return revNum;
    }

}