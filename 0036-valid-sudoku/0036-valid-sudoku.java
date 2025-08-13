public class Solution {
    public boolean isValidSudoku(char[][] board) {

            Set<Character>[] rowSets = new HashSet[9];
            Set<Character>[] colSets = new HashSet[9];
            Set<Character>[] boxSets = new HashSet[9];

            for(int i = 0;i < 9;i++) {
                    rowSets[i] = new HashSet<>();
                    colSets[i] = new HashSet<>();
                    boxSets[i] = new HashSet<>();
            }

            for(int i = 0;i < 9;i++) {
                for(int j = 0;j < 9;j++) {
                     char num = board[i][j];
                     if(num=='.') continue;
                     // row scanning
                     if(!rowSets[i].add(num)) {
                            return false;
                     }
                     // cols checking
                     if(!colSets[j].add(num)) return false;

                     // box checking

                     int boxIndex = (i/3)*3 + (j/3);
                     if(!boxSets[boxIndex].add(num)) return false;
                }
            }

            return true;
    }
}