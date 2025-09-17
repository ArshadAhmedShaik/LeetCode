class Solution {
    public int minimumArea(int[][] grid) {
        int top = -1;
        int bottom = -1;
        int left = -1;
        int right = -1;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n;j++) {
                 if(grid[i][j]==1) {
                    top = i;
                    break;
                 } 
            }
           if(top!=-1) {
                break;
           }
        }

        for(int i = m-1;i >= 0;i--) {
            for(int j = 0;j < n;j++) {
                 if(grid[i][j]==1) {
                    bottom = i;
                    break;
                 } 
            }
           if(bottom!=-1) {
                break;
           }
        }

        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                    if(grid[j][i]==1) {
                    left = i;
                    break;
                 } 
            }
              if(left!=-1) {
                break;
           }
        }

         for(int i = n - 1;i >= 0;i--) {
            for(int j = 0;j < m;j++) {
                    if(grid[j][i]==1) {
                    right = i;
                    break;
                 } 
            }
              if(right!=-1) {
                break;
           }
        }

        return (right-left+1) * (bottom-top+1);

    }
}