// 414. Third Maximum Number

import java.util.Arrays;

public class a47_thirdMax {
     public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int count = 1;
        int i;

        for(i=nums.length-2 ; i>=0 ; i--){

            if(nums[i] != nums[i+1]) {
                count++;
            }

            if(count == 3){
                return nums[i];  // Third distinct max found
            }
            
        }

        return nums[nums.length -1]; // Less than 3 distinct numbers, return max
        
    }
    public static void main(String[] args) {
        
    }
}
