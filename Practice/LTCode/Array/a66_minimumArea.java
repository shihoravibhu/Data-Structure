// 3195. Find the Minimum Area to Cover All Ones I

public class a66_minimumArea {
     public int minimumArea(int[][] grid) {
      
        int minColl = Integer.MAX_VALUE;
        int maxColl = Integer.MIN_VALUE;
        int minRow = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;

        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){               

                if(grid[i][j] == 1){

                    minColl = Math.min(j,minColl); 
                    maxColl = Math.max(j,maxColl);

                    minRow = Math.min(i,minRow); 
                    maxRow = Math.max(i,maxRow);

                }
                
            }
        }

        return (maxColl - minColl + 1) * (maxRow - minRow + 1);
        
    }
    public static void main(String[] args) {
        
    }
}
