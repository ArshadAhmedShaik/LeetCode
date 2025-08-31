class Solution {
    public int diagonalSum(int[][] mat) {
        int primarySum = 0;
        for(int i = 0;i < mat.length;i++) {
                primarySum += mat[i][i];
        }
        int secondarySum = 0;
        for(int j = 0;j < mat.length;j++) {
                secondarySum += mat[mat.length-1-j][j];
        }
        if(mat.length%2!=0)
        return primarySum + secondarySum - mat[mat.length/2][mat.length/2];
        else return primarySum + secondarySum;
    }
}