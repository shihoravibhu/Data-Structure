// 287. Find the Duplicate Number

public class a18_Find_Dublicate_Number {

     public int findDuplicate(int[] nums) {

     int slow = 0 , fast = 0;

     do{
        slow = nums[slow];
        fast = nums[nums[fast]];

     }while(slow!=fast);

    slow = 0;
    
     while(slow!=fast){
        slow = nums[slow];
        fast = nums[fast];
     }

     return slow;
    }
    public static void main(String[] args) {
        
    }
}
