class Solution {
    // public boolean isAllbitSit(int x){
    //     // Apporach 1
    //     return (x & (x + 1)) == 0;
    // }
    public int smallestNumber(int n) {
        // Apporach 1
        // int result = n;
        // while(!isAllbitSit(result)){
        //     result++;
        // }
        // return result;

        // Apporach 2
        // int result = 1 ;
        // while(result < n){
        //     result = 2 * result + 1;
        // }
        // return result;

        // Apporach 3
        int bit = (int) (Math.log(n) / Math.log(2)) + 1;
        return (1 << bit) - 1;
    }
}