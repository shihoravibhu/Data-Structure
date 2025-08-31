// 498. Diagonal Traverse

public class a67_findDiagonalOrder {
      public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[0];

        int m = mat.length , n = mat[0].length , row = 0 , col = 0;

        int[] res = new int[m * n];

        for(int i=0 ; i<m*n ; i++){

            res[i] = mat[row][col];

            if((row + col) % 2 == 0){       // Up jai
                if(col == n-1) row++;
                else if(row == 0) col++;
                else {row-- ; col++;}
            } 
            else{                           // Down jai
                if(row == m-1) col++;
                else if(col == 0) row++;
                else {row++ ; col--;}
            }
        }

        return res;
    }
    public static void main(String[] args) {
        
    }
}
