// 905. Sort Array By Parity

public class a40_sortArrayByParity {
      public int[] sortArrayByParity(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        int j=0 ;

        for(int i=0 ; i<n ; i++){   // First, add even numbers to the result

            if(nums[i] % 2 == 0){
                ans[j++] = nums[i];
            }
        }

        for(int i=0 ; i<n ; i++){    // Then, add odd numbers

            if(nums[i] % 2 != 0){
                ans[j++] = nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
