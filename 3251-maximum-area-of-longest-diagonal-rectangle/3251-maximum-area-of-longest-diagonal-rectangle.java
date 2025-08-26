class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
            long maxArea = 0;
            long maxDiagonal = 0;
            int n = dimensions.length;
            for(int i = 0;i < n;i++) {
                 int length = dimensions[i][0];
                 int breadth = dimensions[i][1];
                 long diagonal = (int)(Math.pow(length, 2) + Math.pow(breadth, 2));
                 long area = length*breadth;
                 if(diagonal>maxDiagonal) {
                        maxArea = area;
                        maxDiagonal = diagonal;
                 } else if(diagonal==maxDiagonal) {
                        maxArea = Math.max(maxArea, area);
                 }
            }

            return (int)maxArea;
            
    }
}