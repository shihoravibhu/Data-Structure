// 867. Transpose Matrix

public class a39_transpose {
    public int[][] transpose(int[][] matrix1) {
        
        int r = matrix1.length;
        int c = matrix1[0].length;

        int[][] matrix = new int[c][r];

        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                matrix[j][i] = matrix1[i][j];
            }
        }

        return matrix;
    }
    public static void main(String[] args) {
        
    }
}
