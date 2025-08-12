class Solution {
    public boolean isValidSudoku(char[][] board) {

          // row scanning
          Set<Character> set = new HashSet<>();
          for(int i = 0;i < 9;i++) {
                char[] arr = board[i];
                for(int j = 0;j < 9;j++) {
                        if(arr[j] >= '1' && arr[j] <= '9') {
                                if(!set.add(arr[j])) return false;
                        }
                }
                set.clear();
          }

          set.clear();

          // cols scanning

          for(int j = 0;j < 9;j++) {
                for(int i = 0;i < 9;i++) {
                        char ch = board[i][j];
                        if(ch >= '1' && ch <= '9') {
                            if(!set.add(ch)) return false;
                        }
                }
                set.clear();
          }

          set.clear();

          // scanning each box:
          
          for(int startRow = 0;startRow < 9;startRow += 3) {
            for(int startCol = 0;startCol < 9;startCol += 3) {
                    for(int i = startRow;i < startRow+3;i++) {
                        for(int j = startCol;j < startCol+3;j++) {
                            char ch = board[i][j];
                               if(ch <= '9' && ch >= '1') {
                              if(!set.add(ch)) return false;
                               }
                        }
                    }
                    set.clear();
            }
          }
          
          return true;

    }
}