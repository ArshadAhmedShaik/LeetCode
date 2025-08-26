class Solution {
    public long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        long topSum = 0;
        for(int x: grid[0]) {
                topSum += x;
        }
        long bottomSum = 0;
        long robot2 = 0;
        long res = Long.MAX_VALUE; // --> minimizes the points taken by robot1
        for(int i = 0;i < n;i++) {
                 topSum -= grid[0][i];
                 robot2 = Math.max(topSum, bottomSum);
                 bottomSum += grid[1][i];
                 res = Math.min(robot2, res);
        }

        return res;

    }
}