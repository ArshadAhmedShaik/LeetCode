class Solution {
    public boolean isValidSudoku(char[][] board) {

         // row scanning 
         Set<Character> set = new HashSet<>();
         for(int i = 0;i < 9;i++) {
            for(int j = 0;j < 9;j++) {
                    if(board[i][j]=='.') continue; 
                    if(!set.add(board[i][j])) return false;
            }
            set.clear();
         }
         // col scanning
         for(int j = 0;j < 9;j++) {
            for(int i = 0;i < 9;i++) {
                    if(board[i][j]=='.') continue;
                    if(!set.add(board[i][j])) return false;
            }
            set.clear();
         }
         // boxes scanning
         for(int startRow = 0;startRow < 9;startRow += 3) {
                for(int startCol = 0;startCol < 9;startCol += 3) {
                        for(int i = startRow;i < startRow + 3;i++) {
                                for(int j = startCol;j < startCol + 3;j++) {
                                        if(board[i][j]=='.') continue;
                                        if(!set.add(board[i][j])) return false;
                                }
                        }
                        set.clear();
                }
         }

         return true;

    }
}