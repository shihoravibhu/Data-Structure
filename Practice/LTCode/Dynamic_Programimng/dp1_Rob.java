public class dp1_Rob {
      public int rob(int[] nums) {

        if(nums.length < 2) return nums[0]; //Only For One Element

        int[] dp = new int[nums.length];

        dp[0] = nums[0];                    
        dp[1] = Math.max(nums[0],nums[1]);  // First 2 index Mate

        for(int i=2 ; i<nums.length ; i++){             
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);      // Understanding by Last 3 House
        }

        return dp[nums.length-1];
        
    }
    public static void main(String[] args) {
        
    }
}
