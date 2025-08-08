// 324. Wiggle Sort II

import java.util.Arrays;

public class a46_wiggleSort {
     public void wiggleSort(int[] nums) {

        int n = nums.length-1;
        
        int[] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);

        for(int i=1 ; i<nums.length ; i+=2){
            nums[i] = arr[n--];
        }
    
        for(int i=0 ; i<nums.length ; i+=2){
            nums[i] = arr[n--];

        }
    }
    public static void main(String[] args) {
        
    }
}
