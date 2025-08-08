// 3330. Find the Original Typed String I

public class s22_possibleStringCount {
     public int possibleStringCount(String word) {
        
        int count = 1;

        for(int i=1 ; i<word.length() ; i++){
            if(word.charAt(i-1) == word.charAt(i)){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        
    }
}
