// 3446. Sort Matrix by Diagonals

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class a69_sortMatrix {
     public int[][] sortMatrix(int[][] matrix) {
             Map<Integer, PriorityQueue<Integer>> diagonalMap = new HashMap<>();
        int rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                diagonalMap.putIfAbsent(key, key < 0 ? new PriorityQueue<>() 
                                                     : new PriorityQueue<>(Collections.reverseOrder()));
                diagonalMap.get(key).offer(matrix[i][j]);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                matrix[i][j] = diagonalMap.get(key).poll();
            }
        }

        return matrix;
    }


// or (Optimize)

// class Solution {
//     public int[][] sortMatrix(int[][] mat) {
//         int rows = mat.length;
//         int cols = mat[0].length;
        
//         for (int row = 0; row < rows; row++) {
//             sortDiagonal(mat, row, 0, false); // false for non-increasing
//         }

//         for (int col = 1; col < cols; col++) {
//             sortDiagonal(mat, 0, col, true); // true for non-decreasing
//         }

//         return mat;
//     }

//     private void sortDiagonal(int[][] mat, int row, int col, boolean increasing) {
//         int rows = mat.length;
//         int cols = mat[0].length;
        
//         int len = Math.min(rows - row, cols - col);
//         int[] diagonal = new int[len];

//         for (int i = 0; i < len; i++) {
//             diagonal[i] = mat[row + i][col + i];
//         }

//         Arrays.sort(diagonal);

//         if (!increasing) {
//             reverse(diagonal);
//         }

//         for (int i = 0; i < len; i++) {
//             mat[row + i][col + i] = diagonal[i];
//         }
//     }
//     private void reverse(int[] arr) {
//         int i = 0, j = arr.length - 1;
//         while (i < j) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//     }
// }
    public static void main(String[] args) {
        
    }
}
