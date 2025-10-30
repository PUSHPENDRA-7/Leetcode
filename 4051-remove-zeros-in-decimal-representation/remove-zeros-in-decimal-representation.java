class Solution {
    public long removeZeros(long n) {
       String s = String.valueOf(n).replace("0","");
       return Long.parseLong(s);
    }
}