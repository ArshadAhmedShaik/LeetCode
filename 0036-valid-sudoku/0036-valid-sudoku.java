public class Solution {
    public boolean isValidSudoku(char[][] board) {

            Set<Character>[] rowSet = new Set[9];
            Set<Character>[] colSet = new Set[9];
            Set<Character>[] boxSet = new Set[9];

            for(int i = 0;i < 9;i++) {
                rowSet[i] = new HashSet<>();
                colSet[i] = new HashSet<>();
                boxSet[i] = new HashSet<>();
            }

            for(int i = 0;i < 9;i++) {
                for(int j = 0;j < 9;j++) {
                        if(board[i][j] == '.') continue;
                        if(!rowSet[i].add(board[i][j])) return false;
                        if(!colSet[j].add(board[i][j])) return false;
                        int boxIndex = (i/3)*3 + (j/3);
                        if(!boxSet[boxIndex].add(board[i][j])) return false;
                }
            }

        return true;            
    }
}