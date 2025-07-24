// 371. Sum of Two Integers

public class m9_Sum_Of_Two_Integer {

    public int getSum(int a, int b) {

        // For ex. a = 2    10
            //     b = 3    11 (perform a^b)  
                         // 01
            // have je carry avi tene apde shift left by 1 karsi so (perform (a & b) << 1; )
                        // ans will be 101 so final ans is 5

        while(b != 0){
            int temp = (a & b) << 1; // a ni value badle te pela aa carry vadu perom karvu pade
            a = a ^ b;
            b = temp;
        }

        return a;
        
    }
    public static void main(String[] args) {
        
    }
}
