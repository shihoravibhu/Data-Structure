// 704. Binary Search

public class b2_search {

     public int search(int[] nums, int target) {

        int st = 0, en = nums.length-1 ;

        while(st <= en){
            int mid = st + (en-st)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                st = mid+1;
            }
            else{
                en = mid-1;
            }
        }

        return -1;
        
    }
    public static void main(String[] args) {
        
    }
}
