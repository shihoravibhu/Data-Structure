// 2873. Maximum Value of an Ordered Triplet I

public class a62_maximumTripletValue {
      public long maximumTripletValue(int[] nums) {

        int n = nums.length;

        long ans = 0;

        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                for(int k=j+1 ; k<n ; k++){

                    ans = Math.max(ans,((long)(nums[i] - nums[j]) * nums[k]));
                }
            }
        }

        return ans;
        
    }
    public static void main(String[] args) {
        
    }
}
