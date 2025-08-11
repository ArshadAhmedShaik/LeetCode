class NumMatrix {
    
    int[][] prefixMatrix;

    public NumMatrix(int[][] matrix) {
            int m = matrix.length;
        int n = matrix[0].length;
        prefixMatrix = new int[m][n];
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n;j++) {

                int top = (i>0) ? prefixMatrix[i-1][j] : 0;
                int left = (j>0) ? prefixMatrix[i][j-1] : 0;
                int diagonal = (i>0 && j>0) ? prefixMatrix[i-1][j-1] : 0;

                prefixMatrix[i][j] = matrix[i][j] + top + left - diagonal;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = prefixMatrix[row2][col2];
    int left = (col1 > 0) ? prefixMatrix[row2][col1 - 1] : 0;
    int top = (row1 > 0) ? prefixMatrix[row1 - 1][col2] : 0;
    int overlap = (row1 > 0 && col1 > 0) ? prefixMatrix[row1 - 1][col1 - 1] : 0;
            return total - left - top + overlap;
    }
}

/**
 * Example usage:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1, col1, row2, col2);
 */
