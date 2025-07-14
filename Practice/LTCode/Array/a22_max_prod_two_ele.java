// 1464. Maximum Product of Two Elements in an Array

import java.util.Arrays;

public class a22_max_prod_two_ele {

     public int maxProduct(int[] arr) {

        // int max = 0;

        // for(int i=0 ; i<arr.length ; i++){
        //     for(int j=i+1 ; j<arr.length ; j++){
        //         max = Math.max(max,(arr[i]-1)*(arr[j]-1));
        //     }
        // }
        // return max;

        // or

       Arrays.sort(arr);

       return (arr[arr.length-2] - 1)* (arr[arr.length-1] - 1) ;
        
    }
    public static void main(String[] args) {
        
    }
}
