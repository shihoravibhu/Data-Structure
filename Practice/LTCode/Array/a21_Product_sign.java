// 1822. Sign of the Product of an Array

public class a21_Product_sign {

     public int arraySign(int[] nums) {

        int sign = 1;

        // for(int i=0 ; i<nums.length ; i++){
        //    if(nums[i] == 0){
        //     return 0;
        //    }
        //    else if(nums[i] > 0){
        //     nums[i] = 1;
        //    }
        //    else{
        //     nums[i] = -1;
        //    }
        // }

        // for(int i=0 ; i<nums.length ; i++){
        //     sign *= nums[i];
        // }

        // if(sign > 0){
        //     return 1;
        // }
        // return -1;

        // or

         for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) sign *= -1;
        }

        return sign;
    }

    public static void main(String[] args) {
        
    }
}
