class Solution {
    public long gridGame(int[][] grid) {
        
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