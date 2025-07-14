// 27.remove element (val)

public class a3_Remove_Element {
     public static int removeElement(int[] nums, int val) {

        int arr[] = new int[nums.length]; 

        int j = 0;    

        for(int i=0 ; i<nums.length ; i++){

            if(nums[i] != val){

                arr[j++] = nums[i];
                
            }

        }       

        for(int i=0 ; i<nums.length ; i++){
            // nums[i] = arr[i];
            System.out.print(arr[i]+" ");
        } 

        return (nums.length-j) ;
        
    }
    public static void main(String[] args) {

        int nums[] = {0,1,2,2,3,0,4,2};

        System.out.println(removeElement(nums, 2));

        
        
    }
}
