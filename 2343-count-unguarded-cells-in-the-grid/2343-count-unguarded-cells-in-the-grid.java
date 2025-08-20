class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] arr = new int[m][n];
        
        for (int[] g : guards) arr[g[0]][g[1]] = 2;
        for (int[] w : walls) arr[w[0]][w[1]] = 2;

        for (int[] g : guards) {
            int i = g[0], j = g[1];
            
            for (int r = i - 1; r >= 0; r--) {
                if (arr[r][j] == 2) break;
                arr[r][j] = 1;
            }
            for (int r = i + 1; r < m; r++) {
                if (arr[r][j] == 2) break;
                arr[r][j] = 1;
            }
            for (int c = j - 1; c >= 0; c--) {
                if (arr[i][c] == 2) break;
                arr[i][c] = 1;
            }
            for (int c = j + 1; c < n; c++) {
                if (arr[i][c] == 2) break;
                arr[i][c] = 1;
            }
        }

        int total = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) total++;
            }
        }
        return total;
    }
}
