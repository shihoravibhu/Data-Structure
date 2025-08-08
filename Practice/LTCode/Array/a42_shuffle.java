// 1470. Shuffle the Array

public class a42_shuffle {
     public int[] shuffle(int[] nums, int n) {

        int[] arr = new int[n * 2];
        int idx = 0;

        for(int i=0 ; i < n ; i++){
            arr[idx++] = nums[i];
            arr[idx++] = nums[i+n];
        } 

        return arr;
        
    }
    public static void main(String[] args) {
        
    }
}
