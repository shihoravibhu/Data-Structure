// 349. Intersection of Two Arrays

import java.util.HashSet;
import java.util.Set;

public class a34_intersection {
     public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i : nums1){
            set1.add(i);
        }

        for(int i : nums2){
            if(set1.contains(i)){       // jo set1 ma hase te elemet to j set2 ma add thase
                set2.add(i);
            }
        }

        int[] arr = new int[set2.size()];
        int idx = 0;

        for(int val : set2){
            arr[idx++] = val;
        }

        return arr;
        
    }
    public static void main(String[] args) {
        
    }
}
