// 1221. Split a String in Balanced Strings

public class s11_balancedStringSplit {

    public int balancedStringSplit(String s) {
        
        int balance = 0;
        int count = 0;

        for(char ch : s.toCharArray()){

            switch(ch){
                case 'L' : balance++; break;
                case 'R' : balance--; break;
            }

            if(balance == 0){
                count++;
            }
        }

        return count ;
    }
    public static void main(String[] args) {
        
    }
}
