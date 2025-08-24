class Solution {
    public long gridGame(int[][] grid) {
        // int n = grid[0].length;
        // int[][] suffix = new int[2][n];
        // suffix[0][n-1] = grid[0][n-1];
        // suffix[1][n-1] = grid[1][n-1];
        // for(int i = n-2;i >= 0;i--) {
        //         suffix[0][i] = suffix[0][i+1] + grid[0][i];
        //         suffix[1][i] = suffix[1][i+1] + grid[1][i];
        // }

        // // robot 1:
        // int i = 0;
        // int j = 0;

        // while(i<2 && j<n) {
        //       grid[i][j] = 0;
        //       int right  = 0;
        //       int bottom = 0;
        //       if(i==0) {
        //         bottom = suffix[i+1][j]; 
        //       } 
        //       if(j<n-1) {
        //         right = suffix[i][j+1];
        //       }

        //       if(bottom>=right) {
        //             i++;
        //       } else {
        //           j++;
        //       }
        // }

        //  // robot 2:
        // suffix[0][n-1] = grid[0][n-1];
        // suffix[1][n-1] = grid[1][n-1];
        // for(int k = n-2;k >= 0;k--) {
        //         suffix[0][k] = suffix[0][k+1] + grid[0][k];
        //         suffix[1][k] = suffix[1][k+1] + grid[1][k];
        // }

        // i = 0;
        // j = 0;
        // int count = 0;

        // while(i<2 && j<n) {
        //       count += grid[i][j];
        //       int right  = 0;
        //       int bottom = 0;
        //       if(i==0) {
        //         bottom = suffix[i+1][j]; 
        //       } 
        //       if(j<n-1) {
        //         right = suffix[i][j+1];
        //       }

        //       if(bottom>=right) {
        //             i++;
        //       } else {
        //           j++;
        //       }
        // }

        // return count;

        // int n = grid[0].length;

        // long[] preRow1 = new long[n];
        // long[] preRow2 = new long[n];
        // preRow1[0] = grid[0][0];
        // preRow2[0] = grid[1][0];
        // for (int i = 1; i < n; i++) {
        //     preRow1[i] = preRow1[i - 1] + grid[0][i];
        //     preRow2[i] = preRow2[i - 1] + grid[1][i];
        // }

        // long res = Long.MAX_VALUE;
        // for (int i = 0; i < n; i++) {
        //     long top = (i == n - 1 ? 0 : preRow1[n - 1] - preRow1[i]);
        //     long bottom = (i == 0 ? 0 : preRow2[i - 1]);
        //     long secondRobot = Math.max(top, bottom);
        //     res = Math.min(res, secondRobot);
        // }

        // return res;

        int n = grid[0].length;
        long topSum = 0, bottomSum = 0;
        for (int i = 0; i < n; i++)
            topSum += grid[0][i];
        long res = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            topSum -= grid[0][i];
            long secondRobot = Math.max(topSum, bottomSum);
            res = Math.min(res, secondRobot);
            bottomSum += grid[1][i];
        }
        return res;

    }
}