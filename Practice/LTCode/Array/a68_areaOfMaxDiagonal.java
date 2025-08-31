// 3000. Maximum Area of Longest Diagonal Rectangle

public class a68_areaOfMaxDiagonal {
     public int areaOfMaxDiagonal(int[][] dimensions) {
        
        // maxD stores the maximum diagonal length squared (to avoid using sqrt)
        long maxD = 0;
        
        // ans stores the area of the rectangle with the maximum diagonal
        int ans = 0;

        // Loop through each rectangle dimension
        for (int[] R : dimensions) {
            
            // Calculate diagonal length squared: (width^2 + height^2)
            long diagonal = (long) R[0] * R[0] + (long) R[1] * R[1];
            
            // Calculate area of the rectangle
            int area = R[0] * R[1];

            // If current rectangle has a larger diagonal, update maxD and area
            if (diagonal > maxD) {
                maxD = diagonal;
                ans = area;
            } 
            // If diagonals are equal, take the rectangle with the larger area
            else if (diagonal == maxD) {
                ans = Math.max(ans, area);
            }
        }

        // Return the area of the rectangle with the largest diagonal (tie → max area)
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
