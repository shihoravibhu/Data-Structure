// 1281. Subtract the Product and Sum of Digits of an Integer

public class a23_subtractProductAndSum {

     public int subtractProductAndSum(int n) {

        int sum = 0 , product = 1;

        while(n!=0){
            int rem = n%10;
            product *= rem;
            sum += rem;
            n = n/10;
        }

        return product - sum;
        
    }
    public static void main(String[] args) {
        
    }
}
