class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
            int len = original.length;

            int[][] matrix = new int[m][n];
            if(len!=m*n) return new int[0][0]; // empty2d array

            for(int i = 0;i < len;i++) {
                    int row = i / n;
                    int col = i % n;
                    matrix[row][col] = original[i];
            }


            return matrix;

    }
}