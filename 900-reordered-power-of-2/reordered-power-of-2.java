class Solution {
    public int[] getSortedStr(int n) {
        int[] count = new int[10];
        while (n > 0) {
            count[n % 10]++;
            n /= 10;
        }
        return count;
    }

    public boolean reorderedPowerOf2(int n) {
        int[] inputCount = getSortedStr(n);

        // Check all powers of 2 up to 2^29
        for (int p = 0; p <= 29; p++) {
            if (Arrays.equals(inputCount, getSortedStr(1 << p))) {
                return true;
            }
        }

        return false;
    }
}