// 2544. Alternating Digit Sum

public class m16_alternateDigitSum {
    public int alternateDigitSum(int n) {
        
        int sum = 0;
        boolean isminise = false;

        // StringBuilder sb = new StringBuilder(n+"");
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        n = Integer.parseInt(sb.reverse().toString());

        while(n != 0){
            int rem = n % 10;

            if(isminise){
                rem *= -1;
                isminise = false;
            }
            else{
                isminise = true;
            }

            sum += rem;
            n = n/10;

        }

        return sum;
    }
    public static void main(String[] args) {
        
    }
}
