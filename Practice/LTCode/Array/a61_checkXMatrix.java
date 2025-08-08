// 2319. Check if Matrix Is X-Matrix

public class a61_checkXMatrix {
     public boolean checkXMatrix(int[][] grid) {

        int n = grid.length;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){

            if(i == j || j == n-1-i){           // diagonal mate

                if(grid[i][j] == 0)  return false;
              
            }
            else{

                if(grid[i][j] != 0) return false;
                
            }

          
            }
        }

        return true;
        
    }
    public static void main(String[] args) {
        
    }
}
