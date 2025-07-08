// 169.Mojority Element

public class a6{

      public int majorityElement(int[] nums) {

        // Arrays.sort(nums);       

        // return nums[nums.length/2]; // karn k ahiya apel che k n/2 karta vadhare element majority vado che so


        // or

        // More Optimize Method

        int freq = 0 , ans = 0; 

        for(int i=0 ; i<nums.length ; i++){
            if(freq == 0){
                ans = nums[i];
            }

            if(ans == nums[i]){
                freq++;
            }
            else{

            freq--;
            }

        }

        return ans;

    }
    public static void main(String[] args) {
        
    }
}