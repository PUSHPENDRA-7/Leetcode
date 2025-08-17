class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(row[i]||col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
       
    }
    
}

// class Solution {
//     public void setZeroes(int[][] matrix) {
//         boolean firstColCheck = false;

//         for(int i = 0; i < matrix.length; i++){
//             if(matrix[i][0] == 0) {
//                     firstColCheck = true;
//                 }
//             for(int j = 1; j  < matrix[0].length; j++){

//                 if(matrix[i][j] == 0) {
//                     matrix[i][0] = 0;
//                     matrix[0][j] =0;
//                 }
//             }
//         }

//         for(int i = matrix.length-1; i >= 0; i--) {
//             for(int j = matrix[0].length-1; j >= 1; j--) {

//                 if(matrix[i][0] == 0 || matrix[0][j] == 0){
//                     matrix[i][j] = 0;
//                 }
//             }

//             if(firstColCheck) {
//                 matrix[i][0] = 0;
//             }
//         }
//     }
// }