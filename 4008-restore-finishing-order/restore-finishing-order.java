class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr = new int[order.length];
        int n = order.length;
        int p = 0;
        for(int u : order){
            for(int f : friends){
                if(f == u){
                    arr[p++] = f;
                }
            }
        }
        return Arrays.copyOf(arr , p);
    }
}