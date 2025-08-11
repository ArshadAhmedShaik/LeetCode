class NumMatrix {
    int[][] rowPrefixSum;
    int[][] colPrefixSum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        rowPrefixSum = new int[m][n];
        colPrefixSum = new int[m][n];

        for (int i = 0; i < m; i++) {
            rowPrefixSum[i][0] = matrix[i][0];
            for (int j = 1; j < n; j++) {
                rowPrefixSum[i][j] = rowPrefixSum[i][j - 1] + matrix[i][j];
            }
        }

        for (int j = 0; j < n; j++) {
            colPrefixSum[0][j] = matrix[0][j];
            for (int i = 1; i < m; i++) {
                colPrefixSum[i][j] = colPrefixSum[i - 1][j] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int r = row1; r <= row2; r++) {
            if (col1 == 0) {
                sum += rowPrefixSum[r][col2];
            } else {
                sum += rowPrefixSum[r][col2] - rowPrefixSum[r][col1 - 1];
            }
        }
        return sum;
    }
}

/**
 * Example usage:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1, col1, row2, col2);
 */
