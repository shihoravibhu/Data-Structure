// 852. Peak Index in a Mountain Array

public class a20_PeakElement_idx {
     public int peakIndexInMountainArray(int[] arr) {
        
    //     int max = Integer.MIN_VALUE;
    //     int maxIdx = 0;

    //     for(int i=0 ; i<arr.length ; i++){
    //         max = Math.max(max,arr[i]);
    //     }

    //     for(int i=0 ; i<arr.length ; i++){

    //       if(max==arr[i]){
    //         maxIdx = i;
    //         break;
    //       }

    //     }

    //     return maxIdx;
 


    // or (Optimize)

    int left = 0 , right = arr.length - 1 ;

    while(left < right){
        int mid = left + (right-left)/2;
       

        if(arr[mid] < arr[mid+1]){
            left = mid+1;       // mid ni right side ma peak elemet hase
        }
        else{
            right = mid;        // peak at mid or left side ma
        }
    }

    return left;        // right=left
    }
    public static void main(String[] args) {
        
    }
}
