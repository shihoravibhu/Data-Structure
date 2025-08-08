// 1252. Cells with Odd Values in a Matrix

public class a43_oddCells {
      public int oddCells(int m, int n, int[][] indices) {
        
        int[] row = new int[m];
        int[] coll = new int[n];

        for(int idx[] : indices){
            row[idx[0]]++;
            coll[idx[1]]++;
        }

        int count = 0;

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){

                if((row[i] + coll[j]) % 2 != 0){
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        
    }
}
