// 342. Power of Four

public class m6_Power_four {

     public boolean isPowerOfFour(int n) {

   
        if (n < 1) return false;

        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;


        // or

        // ahiya n % 3 kariyu che karne jo te na lakhiye to n=8,2.. etle 2^x mate pan aa case sacho padat ane je aa quetion mate wrong that so apde che kariyu k je kai pan number che teno modulo karta apnne 1 made j che ne (4%3==1)

        // return n > 0 && (n & (n-1)) == 0 && n % 3 == 1 ;        
        
        
    }
    public static void main(String[] args) {
        
    }
}
