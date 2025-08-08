// 804. Unique Morse Code Words

import java.util.HashSet;
import java.util.Set;

public class s26_uniqueMorseRepresentations {
     public int uniqueMorseRepresentations(String[] words) {

        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();

        for(String s : words){

            StringBuilder sb = new StringBuilder();

            for(char ch : s.toCharArray()){
                sb.append(arr[ch-'a']);
            }

            set.add(sb.toString());
        } 

        return set.size();
        
    }
    public static void main(String[] args) {
        
    }
}
