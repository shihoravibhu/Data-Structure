// 941. Valid Mountain Array

public class a26_Valid_Mountain_Array {

     public boolean validMountainArray(int[] arr) {

     int n = arr.length;
     int i = 0;

     while(i+1 < n && arr[i] < arr[i+1]){       // For Climb Up
        i++;
     }

     if(i==0 || i==n-1){            // peak cannot be first or last
        return false;
     }

     while(i+1 < n && arr[i] > arr[i+1]){           // For Climb Down
        i++;
     }

     return i == n-1;       // if we reached the end, it is a mountain
    }
    public static void main(String[] args) {
        
    }
}
