// 633. Sum of Square Numbers

public class m23_judgeSquareSum {
     public boolean judgeSquareSum(int c) {        
        
        int l = 0 , r = (int)Math.sqrt(c); // karn k ahiya a^2 + b^2 = c che to a and b ni max value √c j thase so 

        while(l <= r){
            long sum = (long)l * l + (long)r * r; //int over flow no resk rye so apde pelethi j ong rakhi devanu

            if(sum == c){
                return true;
            }
            else if(sum > c){
                r--;
            }
            else{
                l++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        
    }
}
