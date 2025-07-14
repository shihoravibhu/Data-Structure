// 31.nextPermutation

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class a15_Next_Permutation {

      public void nextPermutation(int[] nums) {

        int idx = -1;
        int n = nums.length;

// Step 1: Find the first decreasing element from the right

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                idx = i;
                break;
            }
        }
                     
            List<Integer> list = new ArrayList<>();
        
        for (int num : nums)
            list.add(num);

        if (idx == -1) {         // ahiya idx = -1 etle deecresing order ma j array apel che to have apde tene simply reverse j karvano 

            Collections.reverse(list);

            for (int i = 0; i < n; i++) {
                nums[i] = list.get(i);
            }

            return;
        }

        for (int i = n - 1; i > idx; i--) {     // Step : 2 To find Just Large element to nums[idx]

            if (nums[idx] < nums[i]) {
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                break;
            }

        }

        Arrays.sort(nums, idx + 1, n);          // sort or rev abnne kari sakiye

    }
    public static void main(String[] args) {
        
    }
}
