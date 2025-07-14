//164. Maximum Gap

import java.util.Arrays;

public class a16_Maximum_Gap {
    
     public int maximumGap(int[] arr) {

        int n = arr.length; 
        
        if(n < 2 ){
            return 0;
        }

        Arrays.sort(arr);

        int diff = 0;

        for(int i=0 ; i<n-1 ; i++){

        //    diff = Math.max(diff, arr[i + 1] - arr[i]);

        //    or

            if(diff < (arr[i + 1] - arr[i])){
                diff = arr[i + 1] - arr[i];
            }
        }

        return diff;
    }
    public static void main(String[] args) {

    }
}
