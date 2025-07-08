// 238. Moves Zeroes

public class a1{

     public static void moveZeroes(int[] nums) {

        int arr[] = new int[nums.length];

        int j=0;
        for(int i=0 ; i<nums.length ; i++){
            
            if(nums[i] != 0){
                arr[j++] = nums[i];
            }
        }
        
        for(int i=0 ; i<nums.length ; i++){

           System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        
        int nums[] = {0,1,0,3,12};

        moveZeroes(nums);
    }
}