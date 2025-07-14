// 258. Add Digits

public class a1_AddDigits {
   
    public int addDigits(int n) {

        if(n==0){
            return 0;
        }
        
       return 1 + (n-1) % 9; // remember this
        
    }

    public static void main(String[] args) {
        
    }
}