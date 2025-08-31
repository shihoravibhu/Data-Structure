// 2348. Number of Zero-Filled Subarrays

public class a65_zeroFilledSubarray {
     public long zeroFilledSubarray(int[] nums) {
        
        long total = 0 ;
        int count = 0;

        for(int i=0 ; i<nums.length ; i++){

            if(nums[i] == 0){
                count++;
            }
            else{
                count = 0;
            }

            total += count;
        }
        
        return total;
    }
    public static void main(String[] args) {
        
    }
}
