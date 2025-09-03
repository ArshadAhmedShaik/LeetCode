class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] matrix = new int[n][n];
        for(int[] x: queries) {
                int row1 = x[0];
                int col1 = x[1];
                int row2 = x[2];
                int col2 = x[3];
                matrix[row1][col1]++;
                if(row2+1 < n && col2+1 < n) {
                        matrix[row2+1][col2+1]++;
                }
                if(col2+1 < n) {
                        matrix[row1][col2+1]--;
                }
                if(row2+1<n) {
                        matrix[row2+1][col1]--;
                }
        }

        // row sweep:

        for(int i = 0;i < n;i++) {
            for(int j = 1;j < n;j++) {
                    matrix[i][j] += matrix[i][j-1];
            }
        }

        // col sweep:

        for(int j = 0;j < n;j++) {
            for(int i = 1;i < n;i++) {
                   matrix[i][j] += matrix[i-1][j]; 
            }
        }

        return matrix;
    }
}