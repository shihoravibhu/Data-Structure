// 1572. Matrix Diagonal Sum

public class a59_diagonalSum {
     public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        // for(int i=0 ; i<n ; i++){
        //     for(int j=0 ; j<n ; j++){
        //         if(i == j){
        //             sum+=mat[i][j];
        //         }
        //         if((n-i-1) == (n-j-1)){
        //             sum+=mat[i][j];
        //         }
        //     }

        // }

        // or (Optimize)

        for(int i=0 ; i<n ; i++){
            sum += mat[i][i];       // primary diagonal
            sum += mat[i][n-i-1];   // secondary diagonal
        }

        if(n % 2 != 0){     // Subtract the middle element once if n is odd (since it's counted twice)
            sum -= mat[n/2][n/2];
        }

        return sum;
    }
    public static void main(String[] args) {
        
    }
}
