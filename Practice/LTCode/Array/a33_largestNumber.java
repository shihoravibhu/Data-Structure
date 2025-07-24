// 179. Largest Number

import java.util.Arrays;

public class a33_largestNumber {
     public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        for(int i=0 ; i<nums.length ; i++){
            arr[i] = String.valueOf(nums[i]);   // int to String
        }
        
        // For custom sorting we use comparater (its copare as concatination of string and then larger one is first)

        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));

        if(arr[0].equals("0")){ // ahiya largest number j zero che then its means all numbers are zero so return zero
            return "0";
        }

        StringBuilder sb = new StringBuilder(); // faster then string concatination so we use stringbuilder

        for(String s : arr){
            sb.append(s);            
        }

        return sb.toString();
        
    }    
    public static void main(String[] args) {
        
    }
}
