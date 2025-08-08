// 3131. Find the Integer Added to Array I

import java.util.Arrays;

public class a57_addedInteger {
     public int addedInteger(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        return nums2[0] - nums1[0];
    }
    public static void main(String[] args) {
        
    }
}
