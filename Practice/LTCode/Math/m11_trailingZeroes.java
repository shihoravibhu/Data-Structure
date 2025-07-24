// 172. Factorial Trailing Zeroes

public class m11_trailingZeroes {

      public int trailingZeroes(int n) {
      
        int ans = 0;

        // Number of 5 in the factorial * at least two even num because 
        // aa banne no multiplication karta apnne 10^x made j so te last etle ke trailing zero olny depends on howmany five in this factorial
        
        while(n>0){
            ans += n / 5;
            n = n/5;
        }

        return ans;
        
    }
    public static void main(String[] args) {
        
    }
}
