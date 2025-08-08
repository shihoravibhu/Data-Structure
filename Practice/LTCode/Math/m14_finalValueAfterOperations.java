// 2011. Final Value of Variable After Performing Operations

public class m14_finalValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {

        int ans = 0;
        
        for (String op : operations){
          
          if(op.charAt(1) == '+')
          ans++;
          else
          ans--;
          
        }
        return ans;
        
    }
    public static void main(String[] args) {
        
    }
}
