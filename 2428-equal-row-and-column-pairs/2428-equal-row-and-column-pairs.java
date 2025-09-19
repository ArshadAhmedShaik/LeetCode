class Solution {
    public int equalPairs(int[][] grid) {
   
        Map<String, Integer> rowMap = new HashMap<>();
        int n = grid.length;
        for(int i = 0;i < n;i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j < n;j++) {
                sb.append(grid[i][j]+".");
            }
            rowMap.put(sb.toString(), rowMap.getOrDefault(sb.toString(), 0)+1);
        }

        int count = 0;
        for(int i = 0;i < n;i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j < n;j++) {
                    sb.append(grid[j][i]+".");
            }
            count += rowMap.getOrDefault(sb.toString(), 0);
        }
        return count;
    }
}