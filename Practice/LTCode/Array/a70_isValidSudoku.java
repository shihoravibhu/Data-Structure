// 36. Valid Sudoku

import java.util.HashSet;

public class a70_isValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.')
                    continue;
 
                // StringBuilder row = new StringBuilder("row num " + i + " ma " + board[i][j]);
                // StringBuilder coll = new StringBuilder("coll num " + j + " ma " + board[i][j]);
                // StringBuilder box = new StringBuilder("box num " + i/3 + "_" + j/3 + " ma " + board[i][j]);

                // or (append vadhare prefelleble che)

                StringBuilder row = new StringBuilder()
                        .append("row num ").append(i)
                        .append(" ma ").append(board[i][j]);

                StringBuilder coll = new StringBuilder()
                        .append("col num ").append(j)
                        .append(" ma ").append(board[i][j]);

                StringBuilder box = new StringBuilder()
                        .append("box num ").append(i / 3).append("_").append(j / 3)
                        .append(" ma ").append(board[i][j]);

                if (hs.contains(row.toString()) || hs.contains(coll.toString()) || hs.contains(box.toString())) {
                    return false;
                }

                hs.add(row.toString());
                hs.add(coll.toString());
                hs.add(box.toString());
            }
        }

        return true;
    }
    public static void main(String[] args) {
        
    }
}
