// 53. Maximum Subarray

public class a9 {
    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE , currSum = 0;

        for(int i=0 ; i<nums.length ; i++){
            currSum+=nums[i];
            maxSum = Math.max(maxSum,currSum);

            if(currSum < 0){    //currSum ni Value -ve to tene 0 thi initialization 
                currSum = 0;
            }
        }

        return maxSum;

        // or

        // int maxSum = Integer.MIN_VALUE ;
        // for(int i=0 ; i<nums.length ; i++){
        //     int currSum=0;
        //     for(int j=i ; j<nums.length ; j++){
        //         currSum += nums[j];
        //     maxSum = Math.max(maxSum,currSum);

        //     }
        // }

        // return maxSum;

        
    }
}
