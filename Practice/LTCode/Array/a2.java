public class a2 {

    public static int maxArea(int[] height) {

        int area = 0, maxarea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int width = right - left;

            area = Math.min(height[left], height[right]) * width;
            maxarea = Math.max(maxarea, area);

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
