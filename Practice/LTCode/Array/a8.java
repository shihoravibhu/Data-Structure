// 136. single number

public class a8 {

      public int singleNumber(int[] nums) {

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            ans ^= nums[i];
        }

        return ans;

    }
    public static void main(String[] args) {
        
    }
}
