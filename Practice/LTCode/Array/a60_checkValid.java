// 2133. Check if Every Row and Column Contains All Numbers

import java.util.HashSet;
import java.util.Set;

public class a60_checkValid {
     public boolean checkValid(int[][] matrix) {

        // row and call em bey ma 1 to n element hova joie to j true return 

        int n = matrix.length;

        for(int i=0 ; i<n ; i++){

            Set<Integer> rowset = new HashSet<>();
            Set<Integer> collset = new HashSet<>();

            for(int j=0 ; j<n ; j++){
                rowset.add(matrix[i][j]);
                collset.add(matrix[j][i]);
            }

            if(rowset.size() != n || collset.size() != n){
                return false;
            }
        }

        return true;
        
    }
    public static void main(String[] args) {
        
    }
}
