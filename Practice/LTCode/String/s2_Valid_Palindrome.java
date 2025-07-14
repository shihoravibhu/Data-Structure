// 125. Valid Palindrome

public class s2_Valid_Palindrome {

     public boolean isPalindrome(String s) {

        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int st=0 , end=s.length()-1;

        while(st<end){

            if(s.charAt(st) != s.charAt(end)){
                return false;
            }

           st++;
           end--;
        }

        return true;

        // or       //optimize

        // int st = 0, end = s.length()-1;

        // while (st < end) {

        //     if (!Character.isLetterOrDigit(s.charAt(st))) {
        //         st++;
        //         continue;
        //     }
        //     if (!Character.isLetterOrDigit(s.charAt(end))) {
        //         end--;
        //         continue;
        //     }

        //     if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))) {
        //         return false;
        //     }

        //     st++;
        //     end--;
        // }

        // return true;

    }
    public static void main(String[] args) {
        
    }
}
