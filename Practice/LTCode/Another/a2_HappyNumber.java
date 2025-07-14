// 202. Happy Number 

public class a2_HappyNumber {

    class Solution {

    public int next(int n){

        int sum=0;

        while(n>0){
            int rem = n%10;
            sum+=rem*rem;
            n=n/10;
        }

        return sum;

    }
    public boolean isHappy(int n) {

        while(n!=1 && n!=4){        // aa condition ma 4 etle lidhu che karnke unhappy number ni cycle ma   4 ave j so

            n = next(n);
        }

        return n==1;      //if n=1 then return true

    }
}
    public static void main(String[] args) {
        
    }
}
