class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
            int maxArea = 0;
            int maxDiagonal = 0;
            int n = dimensions.length;
            for(int i = 0;i < n;i++) {
                 int length = dimensions[i][0];
                 int breadth = dimensions[i][1];
                 int diagonal = length*length + breadth*breadth;
                 int area = length*breadth;
                 if(diagonal>maxDiagonal) {
                        maxArea = area;
                        maxDiagonal = diagonal;
                 } else if(diagonal==maxDiagonal) {
                        maxArea = Math.max(maxArea, area);
                 }
            }

            return maxArea;
            
    }
}