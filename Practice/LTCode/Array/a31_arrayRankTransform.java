// 1331. Rank Transform of an Array

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class a31_arrayRankTransform {

    class Solution {
    public int[] arrayRankTransform(int[] arr) {
       
        int[] arr2 = arr.clone();;

        Arrays.sort(arr2);

        Map<Integer,Integer> rankMap = new HashMap<>();

        int rank = 1;

        for(int num : arr2){
            if(!rankMap.containsKey(num)){      // duplicate element ne same key apva mate jo aa rite if statement no lakhiye to duplicate element ne same key no made so

            rankMap.put(num,rank++);
            }
        }

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = rankMap.get(arr[i]);
        }
      
      
        return arr;
        
    }
}

    public static void main(String[] args) {
        
    }
}
