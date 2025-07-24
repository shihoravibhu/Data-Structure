// 81. Search in Rotated Sorted Array II

public class b4_search {
     public boolean search(int[] nums, int target) {

        int start = 0 , end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target) {
                return true;
            }

            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
            }

            else if(nums[start] <= nums[mid]){       // Mid Thi Left Side No Array Sorted Che  

                if(nums[start] <= target && target <= nums[mid]){ // To Tya Binary Search 
                    end = mid-1;
                } 
                else{
                    start = mid+1;      // Left Side
                }        
            }

            else{               // Right Side No Sort Che

                    if(nums[mid] <= target && target <= nums[end]){
                        start = mid+1;
                    }

                    else{
                        end = mid - 1;
                    }
            }
        }

        return false;        
        
    }
    public static void main(String[] args) {
        
    }
}
