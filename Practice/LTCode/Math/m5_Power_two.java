// 231. Power of Two

public class m5_Power_two {

     public boolean isPowerOfTwo(int n) {

        // maximum power of 2 for integer is 2^30 = 1073741824
        
        // return n > 0 && 1073741824 % n == 0;

        // or 

        // Bit manupilation badha 2^x nu and sathe bit opration karta (2^x)-1 0 j made
        
        return n > 0 && (n & (n - 1)) == 0;    
    }
    public static void main(String[] args) {
        
    }
}
