// 922. Sort Array By Parity 2

public class a41_sortArrayByParityII {
      public int[] sortArrayByParityII(int[] nums) {
        
        // int n = nums.length;
        // int[] odd = new int[n/2];
        // int[] even = new int[n/2];
        // int[] ans = new int[n];

        // int j=0 , l=0;

        // for(int i=0 ; i<n ; i++){

        //     if(nums[i] % 2 != 0){
        //         odd[j++] = nums[i];
        //     }
        //     else{
        //         even[l++] = nums[i];
        //     }
        // }

        // j=0 ;
        // l=0;

        // for(int i=0 ; i<n ; i++){

        //     if(i % 2 != 0){
        //         ans[i] = odd[j++];
        //     }
        //     else{
        //         ans[i] = even[l++];
        //     }
        // }

        // return ans;


        // or   (Optimze)

        int n = nums.length;
        int[] ans = new int[n];
        int odd = 1;
        int even = 0;

        for(int num : nums){

            if(num % 2 == 0){
                ans[even] = num;
                even += 2;
            }
            else{
                ans[odd] = num;
                odd += 2;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}
