// 387. First Unique Character in a String

public class s12_firstUniqChar {
      public int firstUniqChar(String s) {

        // Array to count frequency of each lowercase letter (a-z)
        int[] abcd = new int[26]; 

        // First pass: count how many times each character appears
        for(int i=0 ; i<s.length() ;i++){
            abcd[s.charAt(i) - 'a']++;
        }

        for(int i=0 ; i<s.length() ; i++){

            if(abcd[s.charAt(i) - 'a'] == 1){
                return i;       // Found the first unique character 
            }
        }

       
        return -1;  // No unique character found
        
    }
    public static void main(String[] args) {
        
    }
}
