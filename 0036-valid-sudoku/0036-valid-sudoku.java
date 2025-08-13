public class Solution {
    public boolean isValidSudoku(char[][] board) {

        int[] rowMask = new int[9];
        int[] colMask = new int[9];
        int[] boxMask = new int[9];

        for(int i = 0;i < 9;i++) {
            for(int j = 0;j < 9;j++) {

                    if(board[i][j] == '.') continue;
                    int boxIndex = (i/3)*3 + (j/3);

                    int num = board[i][j] - '0';
                    int bit = 1 << num;

                    if((rowMask[i]&bit)!=0) return false;
                    if((colMask[j]&bit)!=0) return false;
                    if((boxMask[boxIndex]&bit)!=0) return false;

                    rowMask[i] |= bit;
                    colMask[j] |= bit;
                    boxMask[boxIndex] |= bit;

            }
        }
            
        return true;            
    }
}