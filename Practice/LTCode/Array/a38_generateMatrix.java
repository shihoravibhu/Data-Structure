// 59. Spiral Matrix II

public class a38_generateMatrix {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int srow = 0 , scoll = 0;
        int erow = n-1 , ecoll = n-1;

        int count = 1;

        while(srow <= erow && scoll <= ecoll ){

            // Top
            for(int i=scoll ; i<=ecoll ; i++){
                matrix[srow][i] = count++;
            }

            // Right
            for(int i=srow+1 ; i<=erow ; i++){
                matrix[i][ecoll] = count++;
            }

            // Bottom
            for(int i=ecoll-1 ; i>=scoll ; i--){
                if(erow == srow){
                    break;
                }
                matrix[erow][i] = count++;
            }

            // Left
            for(int i=erow-1 ; i>=srow+1 ; i--){
                if(ecoll == scoll){
                    break;
                }
                matrix[i][scoll] = count++;
            }

            srow++;
            scoll++;
            ecoll--;
            erow--;

        }
        return matrix;
        
        
    }
    public static void main(String[] args) {
        
    }
}
