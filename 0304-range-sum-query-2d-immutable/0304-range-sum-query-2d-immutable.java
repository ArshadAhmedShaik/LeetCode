class NumMatrix {
    private final int[][] prefix;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] pre = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            int[] preRow = pre[i];
            int[] preRowAbove = pre[i - 1];
            int[] matrixRow = matrix[i - 1];
            for (int j = 1; j <= n; j++) {
                preRow[j] = matrixRow[j - 1] + preRow[j - 1] + preRowAbove[j] - preRowAbove[j - 1];
            }
        }
        this.prefix = pre;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        row2++;
        col2++;
        int[][] pre = this.prefix;
        return pre[row2][col2] - pre[row2][col1] - pre[row1][col2] + pre[row1][col1];
    }
}
