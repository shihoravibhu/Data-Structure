// 263 ugly number
public class a3_uglyNuber {

    

    public boolean isUgly(int n) { // does'nt contain any prime factors athor than 2,3,5

    //     if (n <= 0) {
    //         return false;
    //     }
      
    //   for(int prime : new int[]{2,3,5}){         //jo 2,3,5 vade divisible hoi to last ma 1 vadhe
    //     while (n % prime == 0){
    //         n = n/prime;
    //     }
    //   }

    //   return n==1;


    // or

       if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        
    }
}
