// 48.Rotate Image

public class a5_Rotate_Array {

    public static void rotate(int[][] matrix) {  
        
        int n = matrix.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {        
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;                 

            }
        }

   
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {

               int temp = matrix[i][j];
               matrix[i][j] = matrix[i][n-1-j];
               matrix[i][n-1-j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // matrix[i][j] = ans[i][j];

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        // int matrix[][] = {{5,1,9,11},
        //                 {2,4,8,10},
        //                 {13,3,6,7},
        //                 {15,14,12,16}};

        rotate(matrix);

    }
}
