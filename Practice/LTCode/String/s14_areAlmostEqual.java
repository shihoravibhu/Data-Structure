// 1790. Check if One String Swap Can Make Strings Equal

public class s14_areAlmostEqual {
     public boolean areAlmostEqual(String s1, String s2) {
        
        if(s1.equals(s2)){      // Same J String Che To Direct Return True
            return true;
        }

        
        int first = -1 , second = -1;

        for(int i=0 ; i<s1.length() ; i++){

            if(s1.charAt(i) != s2.charAt(i)){
              if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    // More than 2 mismatches — can't fix with one swap
                    return false;
                }
            }
        }

       
         // Check if exactly two mismatches and swapping makes strings equal
        
        // ama splice method nai chale work only in javascript so remember it
        return second != -1 && s1.charAt(first) == s2.charAt(second) 
        && s1.charAt(second) == s2.charAt(first);

    }
    public static void main(String[] args) {
        
    }
}
