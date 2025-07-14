// 204. Count Primes

import java.util.Arrays;

public class m3_count_prime {
      public int countPrimes(int n) {

        if(n<=2){
            return 0;
        }

       boolean[] isprime = new boolean[n];
       Arrays.fill(isprime,true);

       isprime[0] = false;
       isprime[1] = false;

    //    for(int i=2 ; i<n ; i++){
    //     if(isprime[i]){
    //         for(int j=2*i ; j<n ; j+=i){  // 2*i and j+=i lidhu karnke je te num na multiple pan isprime mathi nikdi jai etle k false karva mate
    //             isprime[j] = false;
    //         }
    //     }
    //    }

    // or (More Optimize)

       for(int i=2 ; i*i<n ; i++){
        if(isprime[i]){
            for(int j=i*i ; j<n ; j+=i){  
                isprime[j] = false;
            }
        }
       }

        int count = 0;

       for(int i=2 ; i<n ; i++){
        if(isprime[i]){
            count++;
        }
       }

       return count;
    }
    public static void main(String[] args) {
        
    }
}
