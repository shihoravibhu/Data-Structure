package Stack;

// 680. Valid Palindrome II

public class s2_validPalindrome {

    public boolean isPalindrome(String s,int left,int right){
         while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;


        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
        return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1); 
            }
        }

        return true;
    }
    public static void main(String[] args) {
        
    }
}
