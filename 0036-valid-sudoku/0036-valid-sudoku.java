public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9], col = new int[9], box = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                int bit = 1 << (c - '0');
                int k = (i / 3) * 3 + j / 3;
                if ((row[i] & bit) > 0 || (col[j] & bit) > 0 || (box[k] & bit) > 0) return false;
                row[i] |= bit; col[j] |= bit; box[k] |= bit;
            }
        }
        return true;
    }
}
