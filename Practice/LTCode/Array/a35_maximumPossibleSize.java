// 3523. Make Array Non- decreasing

public class a35_maximumPossibleSize {

    public int maximumPossibleSize(int[] nums) {
        
        int result = 0;
        int prev = 0;
        for (int x : nums) {
            if (prev <= x) {
                prev = x;
                result++;
            }
        }
        return result;
    

    }
    public static void main(String[] args) {
        
    }
}
