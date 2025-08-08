// 1390. Four Divisors

public class m17_sumFourDivisors {
    public int sumFourDivisors(int[] nums) {
        
    //    int sum = 0;   (risk of tle)

    //     for(int num : nums){

    //         int count = 2;

    //         for(int i=2 ; i<num ; i++){

    //             if(num % i == 0){
    //                 count++;
    //             }
    //         }

    //         if(count == 4){
                
    //         for(int i=1 ; i<=num ; i++){

    //             if(num % i == 0){
    //                 sum += i;
    //             }
    //         }
    //         }
    //     }

    //     if(sum == 0){
    //         return 0;
    //     }

    //     return sum;

    // or (optimize)

            int totalSum = 0;

        for(int num : nums){

            int sum = 0;
            int count = 0;

            for(int i=1 ; i * i<= num ; i++){

                if(num % i == 0){
                   int j = num / i;

                   if(j == i){  // i and j are same, count only once
                    count++;
                    sum += i;    // add it once to the sum
                   }
                   else{        // i and j are different
                    count += 2;
                    sum += i + j;       // add both
                   }

                   if(count > 4) break;
                }
            }
            if (count == 4){

            totalSum += sum;
            }           
            
        }
       
        return totalSum;
        
    }
    public static void main(String[] args) {
        
    }
}
