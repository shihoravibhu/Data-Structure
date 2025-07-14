// 240. Search a 2D Matrix II

public class a10_Search_2D_Matrix_2 {

     public boolean searchMatrix(int[][] matrix, int target) {

       int m = matrix.length;
       int n = matrix[0].length;

       int row=0 , coll = n-1 ;

       while(row < m && coll >= 0){

        if(target == matrix[row][coll]){
            return true;
        }

        else if(target < matrix[row][coll]){
            coll--;
        }

        else{
            row++;
        }
       }

       return false;
        
    }
    public static void main(String[] args) {
        
    }
}
