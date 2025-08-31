// 3649. Number of Perfect Pairs

import java.util.Arrays;

public class a64_perfectPairs {
    public long perfectPairs(int[] nums) {

        // int count = 0;

        // for(int i=0 ; i<nums.length ; i++){
        //     for(int j=i+1 ; j<nums.length ; j++){

        //         int a = nums[i];
        //         int b = nums[j];

        //         int diff = Math.abs(a-b);
        //         int sum = Math.abs(a+b);

        //         if(Math.min(diff,sum) <= Math.min(Math.abs(a),Math.abs(b))){

        //              if(Math.max(diff,sum) >= Math.max(Math.abs(a),Math.abs(b))){

        //                  count++;
        //              }
                    
        //         }
                
        //     }
        // }

        // return count;

             int n = nums.length;
        // Step 1: Work with absolute values
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        
        // Step 2: Sort
        Arrays.sort(nums);

        long count = 0;

        // Step 3: For each nums[i], find valid range of nums[j] (j > i)
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            
            // lower bound and upper bound for nums[j]
            // derived from your condition
            int low = x - x;   // simplify → 0
            int high = 2 * x;  // approximate upper limit
            
            // binary search for first index >= low
            int left = lowerBound(nums, i + 1, n, low);
            // binary search for first index > high
            int right = upperBound(nums, i + 1, n, high);
            
            count += (right - left);
        }

        return count;
    }

    // First index in [lo, hi) >= target
    private int lowerBound(int[] arr, int lo, int hi, int target) {
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    // First index in [lo, hi) > target
    private int upperBound(int[] arr, int lo, int hi, int target) {
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] <= target) lo = mid + 1;
            else hi = mid;
        }
        return lo;

    }
    public static void main(String[] args) {
        
    }
}
