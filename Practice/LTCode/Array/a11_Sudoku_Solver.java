// 37.sudoku solver

public class a11_Sudoku_Solver {
      public static boolean issafe(char[][] board, int row, int coll, char dig) {

        // fix row ma badhi coll check karta k tya ee digit che k nai
        for (int j = 0; j<9; j++) {
            if (board[row][j] == dig) {
                return false; // jo che to false return karnk te digit apde pacho tya put no kari sakiye
            }
        }

        // fix coll ma badhi row
        for (int i = 0; i<9; i++) {
            if (board[i][coll] == dig) {
                return false;
            }
        }

    int r=(row/3)*3;
    int c=(coll/3)*3;

    //3*3 vada box ma check karva mate
    for(int i=r ; i<=r+2 ;i++){
        for(int j=c ; j<=c+2 ; j++){
            if(board[i][j] == dig){
                return false;
            }
        }
    }
    return true;
    }

    public static boolean helper(char[][] board, int row, int coll) {
        if (row == 9) {     //base case
            return true;
        }

        int newrow = row, newcoll = coll + 1;

        if (newcoll == 9) {
            newrow = row + 1;
            newcoll = 0;
        }

        if (board[row][coll] != '.') { //pelethi tya digit che j to newrow/coll sathe pacho function ne call

            return helper(board, newrow, newcoll);
        }

        // insert digit in empty space
        for (char dig = '1'; dig<='9'; dig++) {

            if (issafe(board, row, coll , dig)) {

                board[row][coll] = dig;

                if (helper(board, newrow, newcoll)) {
                    return true;
                }

                board[row][coll] = '.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {

        helper(board, 0, 0);
    }
    public static void main(String[] args) {
        
    }
}
