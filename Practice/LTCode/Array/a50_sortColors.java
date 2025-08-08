// 75. Sort Colors

public class a50_sortColors {
     public void sortColors(int[] nums) {
        
        // for(int i=0 ; i<nums.length ;i++){
        //     for(int j=i ; j<nums.length ; j++)
        //     if(nums[i] > nums[j]){
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //     }
        // }

        // or(Optimize)  // color new sort 0 1 2 ee rite karva mate

        int low = 0 , high = nums.length - 1 , mid = 0;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid++] = nums[low]; 
                nums[low++] = temp;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high]; 
                nums[high--] = temp;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
