// 326. Power of Three

public class m4_Power_three{

      public boolean isPowerOfThree(int n) {

        // The largest power of 3 within signed 32-bit int is 3^19 = 1162261467

       return n > 0 && 1162261467 % n == 0; 

    }

    public static void main(String[] args) {
        
    }
}