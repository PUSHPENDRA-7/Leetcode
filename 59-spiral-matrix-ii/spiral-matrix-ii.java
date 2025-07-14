class Solution {
    public int[][] generateMatrix(int n) {
        if(n == 0){
            return new int[0][0];
        }
        int m = n ;
        int[][] matrix = new int[m][n];
        int top = 0;
        int down = m-1;
        int left = 0;
        int right = n-1;

        int dir = 0;
        int counter = 1;

        //id
        //0   -> left  to right
        //1   -> top   to down
        //2   -> right to left
        //3   -> down  to top

        while(top <= down && left <= right){
            //left to right
            if(dir == 0){
                for(int i=left; i<=right; i++){
                   matrix[top][i] = counter++;
                }
                top++;
            }

            //top to down
            if(dir == 1){
                for(int i=top; i<=down; i++){
                    matrix[i][right] = counter++;
                }
                right--;
            }

            //right to left
            if(dir == 2){
                for(int i=right; i>=left; i--){
                    matrix[down][i] = counter++;
                }
                down--;
            }

            //down to top
            if(dir == 3){
                for(int i=down; i>=top; i--){
                    matrix[i][left] = counter++;
                }
                left++;
            }
            
            dir = (dir + 1) % 4;
        }
        return matrix;
    }
}