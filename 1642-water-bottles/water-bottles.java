class Solution {
    public int numWaterBottles(int numB, int numEx) {
      return numB + (numB - 1)/ (numEx - 1); 
    }
}