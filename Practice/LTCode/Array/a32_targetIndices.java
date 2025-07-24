// 2089. Find Target Indices Sol After Sorting Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a32_targetIndices {

    class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0 ; i < nums.length ; i++){
            if(nums[i] == target){
                list.add(i);
            }
        }

        return list;
    }
}
    public static void main(String[] args) {
        
    }
}
