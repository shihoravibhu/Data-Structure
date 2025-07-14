// LeetCode 11: Container With Most Water
// This function finds the maximum area of water a container can store given an array of heights.

public class a2_Container_with_most_water {

    /**
     * Calculates the maximum area of water that can be contained.
     * Uses two-pointer approach to find the largest area between two lines.
     * @param height Array of heights representing vertical lines.
     * @return The maximum area of water that can be contained.
     */
    public static int maxArea(int[] height) {

        int area = 0, maxarea = 0;
        int left = 0, right = height.length - 1;

        // Move the pointers towards each other, always keeping the larger area
        while (left < right) {
            int width = right - left;

            area = Math.min(height[left], height[right]) * width;
            maxarea = Math.max(maxarea, area);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } 
            else {
                right--;
            }
        }

        return maxarea;
    }

    public static void main(String[] args) {

        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height)); // Expected output: 49

    }
}
