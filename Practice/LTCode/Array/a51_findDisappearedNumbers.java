// 448. Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class a51_findDisappearedNumbers {
     public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        for (int i = 1; i <= nums.length; i++) {

            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;

    }
    public static void main(String[] args) {
        
    }
}
