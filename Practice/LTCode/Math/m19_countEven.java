// 2180. Count Integers With Even Digit Sum

public class m19_countEven {
     public int countEven(int num) {
        
        // int count = 0;

        // for(int i=2 ; i<=num ; i++){
        //     int n = i;
        //     int sum = 0;
        //     while(n!=0){
        //         int rem = n%10;
        //         sum+=rem;
        //         n = n/10;
        //     }
        //     if(sum % 2 == 0){
        //         count++;
        //     }
        // }

        // return count;

        // or (Optimize)

        int temp = num , sum = 0;

        while(num > 0){
            sum += num % 10;
            num = num / 10;
        }

        return sum % 2 == 0 ? temp / 2 : (temp - 1) / 2; 
    }
    public static void main(String[] args) {
        
    }
}
