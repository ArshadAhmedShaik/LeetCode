class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {

            Set<Character> rows = new HashSet<>();
            Set<Character> cols = new HashSet<>();
            Set<Character> boxes = new HashSet<>();

            for(int j = 0;j < 9;j++) {

             

                    if(board[i][j]!='.' && !rows.add(board[i][j])) return false;
                

                    if(board[j][i]!='.' && !cols.add(board[j][i])) return false;
            

                int rowIndex = 3 * (i / 3) + j / 3;
                int colIndex = 3 * (i % 3) + j % 3;

                    if(board[rowIndex][colIndex]!='.' && !boxes.add(board[rowIndex][colIndex])) return false; 

            }
        }

        return true;

    }
}