// 3643. Flip Square Submatrix Vertically

package Contest_q;

public class q1_reverseSubmatrix {

    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        int top = x;
        int bottom = x + k - 1;

        while (top < bottom) {

            for (int j = y; j < y + k; j++) {

                int temp = grid[top][j];
                grid[top][j] = grid[bottom][j];
                grid[bottom][j] = temp;

            }
            top++;
            bottom--;
        }

        return grid;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int x = 1, y = 1, k = 3; // Reverse the 3x3 submatrix starting at (1,1)

        q1_reverseSubmatrix obj = new q1_reverseSubmatrix();
        int[][] result = obj.reverseSubmatrix(grid, x, y, k);

        // Print the grid after reversal
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
