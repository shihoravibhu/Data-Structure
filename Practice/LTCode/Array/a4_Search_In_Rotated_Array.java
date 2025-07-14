// 33. Search in Rotated Sorted Array

public class a4_Search_In_Rotated_Array {

    public int search(int[] nums, int target) {

        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) { // Mid Thi Left Side No Array Sorted Che

                if (nums[start] <= target && target <= nums[mid]) { // To Tya Binary Search
                    end = mid - 1;
                } else {
                    start = mid + 1; // Left Side
                }
            }

            else { // Right Side No Sort Che

                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        a4_Search_In_Rotated_Array obj = new a4_Search_In_Rotated_Array();
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int result = obj.search(nums, target);
        System.out.println("Index of target " + target + ": " + result); // Expected: 4

        target = 3;
        result = obj.search(nums, target);
        System.out.println("Index of target " + target + ": " + result); // Expected: -1

        target = 7;
        result = obj.search(nums, target);
        System.out.println("Index of target " + target + ": " + result); // Expected: 3

    }
}
