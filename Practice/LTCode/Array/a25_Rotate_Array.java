// 189. Rotate Array

public class a25_Rotate_Array {
     public void rotate(int[] nums, int k) {

        int n = nums.length;

        int[] arr = new int[n];

        k = k%n;
        k = n-k;

        // Copy nums[k..n-1] to arr[0..n-k-1]
        for(int i=k,j=0 ; i<n ; i++,j++){
            arr[j] = nums[i];
        }

        // Corrected: Copy nums[0..k-1] to arr[n-k..n-1]
        for(int i=0 , j = n-k; i<k ; i++ , j++){
            arr[j] = nums[i];
        }

        for(int i=0 ; i<n ; i++){
            nums[i] = arr[i];
        }
        
    }
    public static void main(String[] args) {
        
    }
}
