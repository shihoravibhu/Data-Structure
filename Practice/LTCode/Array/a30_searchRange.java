// 34. Find First and Last Position of Element in Sorted Array

public class a30_searchRange {

      public int[] searchRange(int[] nums, int target) {

        // int[] ans = new int[2];

        // ans[0] = -1;
        // ans[1] = -1;

        // for(int i=0 ; i<nums.length ; i++){
        //     if(nums[i] == target){
        //         ans[0] = i;
        //         break;
        //     }
        // }

        // for(int i=nums.length-1 ; i>=0 ; i--){
        //     if(nums[i] == target){
        //         ans[1] = i;
        //         break;
        //     }
        // }

        // return ans;


        // or (Optimize) (O(logn))

         int[] ans = new int[2];

        ans[0] = -1;
        ans[1] = -1;
        int i=0;

        int st=0 , en = nums.length-1;

        while(st <= en){            //findFirst
            int mid = st + (en-st)/2;

            
            if(nums[mid] < target){
                st = mid+1;
            }
            else if(nums[mid] > target){
                en = mid-1;
            }
            else if(nums[mid] == target){
                ans[i] = mid;       // possible first occurrence
                en = mid-1;         // keep searching right
            }
        }

        i++;

        st = 0;
        en = nums.length - 1;


         while(st <= en){           //findLast
            int mid = st + (en-st)/2;

            
            if(nums[mid] < target){
                st = mid+1;
            }
            else if(nums[mid] > target){
                en = mid-1;
            }
            else if(nums[mid] == target){
                ans[i] = mid;       // possible last occurrence
                st = mid+1;          // keep searching right
            }
        }

        return ans;



        
    }
    public static void main(String[] args) {
        
    }
}
