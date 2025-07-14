// LeetCode 389: Find the Difference
// This function finds the extra character added to string t, which is a shuffled version of string s with one extra character.

public class a12_find_The_Difference {

  
    public char findTheDifference(String s, String t) {

        // Brute force approach (commented out):
        // if(s.length() == 0){
        //     return t.charAt(0);
        // }
        // for(int i=0 ; i<s.length() ; i++){
        //     char ch = s.charAt(i);
        //     int idx = t.indexOf(ch);
        //     if(ch == t.charAt(idx)){
        //         t = t.substring(0,idx) + t.substring(idx+1);
        //     }
        // }
        // return t.charAt(0);

        // Optimized approach using XOR:
        char result = 0;
        for(int i=0 ; i<s.length() ; i++){
            result ^= s.charAt(i);
        }
        for(int i=0 ; i<t.length() ; i++){
            result ^= t.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        a12_find_The_Difference obj = new a12_find_The_Difference();
        String s = "abcd";
        String t = "abcde";
        System.out.println(obj.findTheDifference(s, t)); // Expected output: e
    }
}
