public class Solution {
    public boolean isValidSudoku(char[][] board) {

            Set<Character>[] rowSet = new Set[9];
            Set<Character>[] colSet = new Set[9];
            Set<Character>[]  boxes = new Set[9];

             for(int i = 0;i < 9;i++) {
                    rowSet[i] = new HashSet<>();
                    colSet[i] = new HashSet<>();
                    boxes[i] = new HashSet<>();
             }

             for(int i = 0;i < 9;i++) {
                for(int j = 0;j < 9;j++) {
                        char ch = board[i][j];
                        if(ch=='.') continue;
                        if(!rowSet[i].add(ch)) return false;
                        if(!colSet[j].add(ch)) return false;
                        int boxIndex = (i/3)*3 + (j/3);
                        if(!boxes[boxIndex].add(ch)) return false;
                }
             }

             return true;
            
    }
}