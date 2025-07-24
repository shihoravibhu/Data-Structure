// 507. Perfect Number

public class m12_checkPerfectNumber {

     public boolean checkPerfectNumber(int num) {

        if(num <= 1) return false;

        int sum = 0;

        for(int i=1 ; i * i <= num ; i++){
            if(num % i == 0){
            sum+=i;

            if(i*i != num){
                sum += num/i ;
            }

            }
        }       

        return sum - num == num ;
        
    }

    public static void main(String[] args) {
        
    }
}
