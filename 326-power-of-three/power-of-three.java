class Solution {
    public boolean isPowerOfThree(int n) {
        //Approch 1 iterative
        // if(n <= 0){
        //     return false;
        // }
        // while(n % 3 == 0){
        //     n /= 3;
        // }
        // return n == 1;

        // Approch 2 Recursion
        // if (n <= 0)
        //     return false;
        // if (n == 1)
        //     return true;

        // if (n % 3 != 0)
        //     return false;

        // return n%3 == 0 && isPowerOfThree(n / 3);

        // Approch 3 
        // if(n <= 0) return false;

        // double x = Math.log10(n) / Math.log10(3);

        // // Check if logValue is an integer
        // return x == (int) x;

        //Approch 4

        return n > 0 && 1162261467%n == 0;
    }

}