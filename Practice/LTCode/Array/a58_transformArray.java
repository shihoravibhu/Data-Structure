// 3467. Transform Array by Parity

import java.util.Arrays;

public class a58_transformArray {
       public int[] transformArray(int[] nums) {

        // O(log(n))

        for(int i=0 ; i<nums.length ; i++){

            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }

        Arrays.sort(nums);

        return nums;

        // or O(n)

        // int j = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] % 2 == 0) {
        //         nums[j++] = 0;
        //     }
        // }
        // while (j < nums.length) {
        //     nums[j++] = 1;
        // }
        // return nums;
        
    }
    public static void main(String[] args) {
        
    }
}
