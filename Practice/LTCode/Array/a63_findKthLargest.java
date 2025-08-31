// 215. Kth Largest Element in an Array

import java.util.PriorityQueue;

public class a63_findKthLargest {
     public int findKthLargest(int[] nums, int k) {

    //     Arrays.sort(nums); O(logn)
        
    //    return nums[nums.length - k];

    //    or (without sorting)  O(n logk)

        PriorityQueue<Integer> pq = new PriorityQueue<>();     // by default desending ma j odhvai (bottom to top jota)

        for(int n : nums){
            pq.add(n);

            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.poll();
    }
    public static void main(String[] args) {
        
    }
}
