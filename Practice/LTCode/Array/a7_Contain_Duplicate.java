// 217.contain duplicate

import java.util.Arrays;

public class a7_Contain_Duplicate {
    
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {

                return true;
            }

        }

        return false;

    }
    public static void main(String[] args) {
        
    }
}
